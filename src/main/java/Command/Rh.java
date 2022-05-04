package Command;

import java.util.ArrayList;
import java.util.List;

public class Rh {

    private List<Acao> tarefas = new ArrayList<Acao>();

    public void executarAcao(Acao acao) {
        this.tarefas.add(acao);
        acao.executar();
    }

    public void cancelarUltimaAcao() {
        if (tarefas.size() != 0) {
            Acao acao = this.tarefas.get(this.tarefas.size() - 1);
            acao.cancelar();
            this.tarefas.remove(this.tarefas.size() - 1);
        }
    }

}
