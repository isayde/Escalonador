public class Processos {
    private int id;
    private int prioridade;
    private int tempoExecucao;
    private int tempoEspera;

    public Processos(int id, int prioridade, int tempoExecucao) {
        this.id = id;
        this.prioridade = prioridade;
        this.tempoExecucao = tempoExecucao;
    }
    public int getPrioridade() {
        return prioridade;
    }
    public void setTempoEspera(int tempo){
        this.tempoEspera = tempo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }

    public void setTempoExecucao(int tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
    
    

    
}
