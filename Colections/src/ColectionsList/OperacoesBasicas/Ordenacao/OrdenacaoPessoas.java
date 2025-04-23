package ColectionsList.OperacoesBasicas.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //atributos
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public  void  adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));

    }
    public List<Pessoa> ordenarPorIdade(){
        List <Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List <Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura,new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas OP =new OrdenacaoPessoas();

        OP.adicionarPessoa("Alexandre",30, 1.75);
        OP.adicionarPessoa("Maria",25, 1.65);
        OP.adicionarPessoa("João",40, 1.80);
        OP.adicionarPessoa("Carlos",22, 1.70);
        OP.adicionarPessoa("Ana", 28, 1.60);

        System.out.println(OP.ordenarPorAltura()+"-----------------------");
        System.out.println(OP.ordenarPorIdade());



    }
}
