
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class EscalonadorPrioridade {
    private List<Processo> processos;

    public EscalonadorPrioridade() {
        this.processos = new ArrayList<>();   
    }  
    public void adicionarProcesso(int id, int prioridade, int tempoExecucao, int interrupcao){
        processos.add(new Processo(id, prioridade, tempoExecucao, interrupcao));
    }
    public void ordenarProcessos(){
        Collections.sort(processos, Comparator.comparingInt(processos -> processos.getPrioridade()));
    }   
    public void inicializarProcessos() throws InterruptedException{
        Random aleatorio = new Random();
        int tempoAtual = 0;
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("|%-6s|%-11s|%-15s|%-13s|%-12s|%-14s|%-11s|\n", "ID", "PRIORIDADE", "TEMPO EXECUCAO", "TEMPO ESPERA", "INTERRUPCAO", "EXECUÇÃO TOTAL", "TURNAROUND");
        System.out.println("------------------------------------------------------------------------------------------");
        ordenarProcessos();
        while (!processos.isEmpty()) {
            
            
            ordenarProcessos();
            
            Processo processo = processos.remove(0);
            if(aleatorio.nextInt(10) < 2){
                int tempoInterrupcao = aleatorio.nextInt(20)+1;
                processo.setTempoExecucao(processo.getTempoExecucao());
                processo.setInterrupcao(tempoInterrupcao);
            }
            processo.setTempoEspera(tempoAtual);
            processo.setTurnaround(tempoAtual + processo.getTempoExecucao()+ processo.getInterrupcao());
            System.out.printf("|%-6s|%-11s|%-15s|%-13s|%-12s|%-14s|%-11s|\n", processo.getId(), processo.getPrioridade(), processo.getTempoExecucao(), processo.getTempoEspera(), processo.getInterrupcao(), processo.getTempoExecucao()+processo.getInterrupcao(), processo.getTurnaround());
            tempoAtual += processo.getTempoExecucao() + processo.getInterrupcao();  
           
        }
        System.out.println("------------------------------------------------------------------------------------------");
         System.out.println("   Processos finalizado! Tempo de execuçlão do sistema: " + tempoAtual + " segundos");
    }


    public static void main(String[] args) throws InterruptedException{
        EscalonadorPrioridade escalonador = new EscalonadorPrioridade();
        Random aleatorio = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de processos: ");
        int quant = sc.nextInt();

        for(int i = 1; i<=quant; i++){
            escalonador.adicionarProcesso(i, aleatorio.nextInt(20)+1, aleatorio.nextInt(20)+1, 0);
        }
        escalonador.inicializarProcessos();
        
    }

    
    
}
