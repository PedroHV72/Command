package Command;

public class AcaoIniciarContrato implements Acao {

    private Contrato contrato;

    public AcaoIniciarContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public void executar() {
        this.contrato.efetuarContrato();
    }

    public void cancelar() {
        this.contrato.finalizarContrato();
    }
}
