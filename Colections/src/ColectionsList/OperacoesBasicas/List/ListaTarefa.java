package ColectionsList.OperacoesBasicas.List;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    //atributos
    private List<Tarefa> TarefaList;

    public ListaTarefa(){
        this.TarefaList = new ArrayList<>();
    }
    public void adcionartarfa (String descricao){
        TarefaList.add(new Tarefa(descricao));

    }
    public void removertarefa(String descricao){
        List<Tarefa> tarefasparaRemover = new ArrayList<>();
        for (Tarefa t : TarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasparaRemover.add(t);

            }
        }
        TarefaList.removeAll(tarefasparaRemover);

    }
    public  int obterNumerosTotalTarefas(){
        return TarefaList.size();

    }
    public void obterDescricoaoTerefas(){
        System.out.println(TarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista é: "+listaTarefa.obterNumerosTotalTarefas());
        listaTarefa.adcionartarfa("Tarefa1");
        listaTarefa.adcionartarfa("Tarefa3");
        listaTarefa.adcionartarfa("Tarefa2");
        listaTarefa.adcionartarfa("Tarefa3");
        listaTarefa.removertarefa("Tarefa3");
        System.out.println("O numero total de elementos na lista é: "+listaTarefa.obterNumerosTotalTarefas());
        listaTarefa.obterDescricoaoTerefas();
    }

}
