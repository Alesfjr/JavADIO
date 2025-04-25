package ColectionsSet.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributos
    private Set<Convidado>ConvidadoSet;

    public ConjuntoConvidados(){
        this.ConvidadoSet=new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigo){
        ConvidadoSet.add(new Convidado(nome,codigo));

    }
    public void removerConvidadoPorCodigoConvite(int codigo){
        Convidado ConvidadoParaRemover = null;

        for (Convidado c: ConvidadoSet){
            if (c.getCodigo()==codigo){
                ConvidadoParaRemover =c;
                break;
            }

        }
        ConvidadoSet.remove(ConvidadoParaRemover);
    }
    public  int contarConvidado(){

        return ConvidadoSet.size();
    }
    public void  exibirConvidados(){
        System.out.println(ConvidadoSet);
    }


    public static void main(String[] args) {

        ConjuntoConvidados convidado = new ConjuntoConvidados();

        convidado.adicionarConvidado("Alexandre", 1);
        convidado.adicionarConvidado("Maria", 2);
        convidado.adicionarConvidado("João", 3);
        convidado.adicionarConvidado("Carlos", 4);
        convidado.adicionarConvidado("Ana", 5);
        System.out.println("Numeros de condidos:"+convidado.contarConvidado());
        convidado.removerConvidadoPorCodigoConvite(1);
        convidado.removerConvidadoPorCodigoConvite(2);
        System.out.println("Novo Numeros de condidos:"+convidado.contarConvidado());
        convidado.contarConvidado();




    }

}
