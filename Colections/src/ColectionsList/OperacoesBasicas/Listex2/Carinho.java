package ColectionsList.OperacoesBasicas.Listex2;

import java.util.ArrayList;
import java.util.List;

public class Carinho  {


    private List<Item> CarinhoCompras;

    public Carinho(){
        this.CarinhoCompras= new ArrayList<>();

    }

    public void adicionarItem(String nome, double preco, int quantidade){

        CarinhoCompras.add(new Item(nome,preco,quantidade));

    }
    public void removerItem(String nome, double preco, int quantidade) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : CarinhoCompras) {
            if (item.getNome().equalsIgnoreCase(nome)
                    && item.getPreco() == preco
                    && item.getQuantidade() == quantidade) {
                itensParaRemover.add(item);
            }
        }

        CarinhoCompras.removeAll(itensParaRemover);
    }
        public double calcularValorTotal(){
            double total = 0.0;
            for (Item item:CarinhoCompras){
                total+= item.getPreco()* item.getQuantidade();

        }
            return total;

        }
    public void exibirItens(){
        for (Item item: CarinhoCompras){
            System.out.println("Item: " + item.getNome() +
                " | Preço: R$" + item.getPreco() +
                " | Quantidade: " + item.getQuantidade());
        }
    }

    public static void main(String[] args) {
        Carinho carinho =new Carinho();

        carinho.adicionarItem("arroz",33.0,2);
        carinho.adicionarItem("feijao",15.0,3);
        carinho.adicionarItem("iorgut",3.0,10);
        carinho.adicionarItem("oleo",9.50,2);
        System.out.println("Produtos no carinho: " );
        carinho.removerItem("arroz",33.0,1);
        carinho.exibirItens();

        System.out.println("Valor total:" );
        double total = carinho.calcularValorTotal();
        System.out.println(total);


    }
}
