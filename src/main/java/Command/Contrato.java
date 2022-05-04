package Command;

public class Contrato {

    private int ano;
    private int contrato;
    private String situacao;

    public Contrato(int ano, int contrato) {
        this.ano = ano;
        this.contrato = contrato;
    }

    public String getSituacao() {
        return situacao;
    }

    public void efetuarContrato() {
        this.situacao = "Contrato iniciado";
    }

    public void finalizarContrato() {
        this.situacao = "Contrato finalizado";
    }
}
