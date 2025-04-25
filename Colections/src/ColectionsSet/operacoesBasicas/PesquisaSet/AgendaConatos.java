package ColectionsSet.operacoesBasicas.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaConatos {

    private Set<Contato> ContatoSet;

    public AgendaConatos(){
        this.ContatoSet=new HashSet<>();
    }
    public adicionarContato(String nome, int numero){
        ContatoSet.add(new Contato(nome, numero));

    }
    public exibirContatos(){
        System.out.printf(ContatoSet);

    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> ContatosPorNome;
        for (Contato c : ContatoSet){
            if (c.getNome().startsWith(nome)){
                ContatosPorNome.add(c);

            }
        }
        return ContatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato ContatoAtualizado =null;
        for(Contato c : ContatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                break;
            }
        }
        return ContatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaConatos AC =new AgendaConatos();

        AC.;
    }
}
