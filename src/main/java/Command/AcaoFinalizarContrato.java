package Command;

public class AcaoFinalizarContrato implements Acao {

    private Contrato contrato;

    public AcaoFinalizarContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public void executar() {
        this.contrato.finalizarContrato();
    }

    public void cancelar() {
        this.contrato.efetuarContrato();
    }
}
