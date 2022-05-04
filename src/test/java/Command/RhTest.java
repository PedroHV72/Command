package Command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RhTest {
    Rh rh;
    Contrato contrato;

    @BeforeEach
    void setUp() {
        rh = new Rh();
        contrato = new Contrato (2022, 1);
    }

    @Test
    void deveIniciarContrato() {
        Acao acao = new AcaoIniciarContrato(contrato);
        rh.executarAcao(acao);

        assertEquals("Contrato iniciado", contrato.getSituacao());
    }

    @Test
    void deveFinalizarContrato() {
        Acao acao = new AcaoFinalizarContrato(contrato);
        rh.executarAcao(acao);

        assertEquals("Contrato finalizado", contrato.getSituacao());
    }

    @Test
    void deveCancelarFinalizacaoContrato() {
        Acao acaoIniciar = new AcaoIniciarContrato(contrato);
        Acao acaoFinalizar = new AcaoFinalizarContrato(contrato);

        rh.executarAcao(acaoIniciar);
        rh.executarAcao(acaoFinalizar);

        rh.cancelarUltimaAcao();

        assertEquals("Contrato iniciado", contrato.getSituacao());
    }
}
