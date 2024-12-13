public class Processo {
    private int id;
    private int prioridade;
    private int tempoExecucao;
    private int tempoEspera;
    private int interrupcao;
    private int turnaround;
    

    public int getTurnaround() {
        return turnaround;
    }
    public void setTurnaround(int turnaround) {
        this.turnaround = turnaround;
    }
    public Processo(int id, int prioridade, int tempoExecucao, int interrupcao) {
        this.id = id;
        this.prioridade = prioridade;
        this.tempoExecucao = tempoExecucao;
        this.interrupcao = interrupcao;
    }
    public int getInterrupcao() {
        return interrupcao;
    }
    public void setInterrupcao(int interrupcao) {
        this.interrupcao = interrupcao;
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
