package ColectionsList.OperacoesBasicas.PesquisaList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo,autor,anoPublicacao));

    }
    public List<Livro > pesquisarPorAutor(String autor){
        List<Livro > livrosporAutor=new ArrayList<>();
        if(!livrosList.isEmpty()){
            for (Livro l:livrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosporAutor.add(l);
                }
            }

        }

        return livrosporAutor;
    }
    public List<Livro > pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> LivrosPorIntervaloAnos = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if(l.getAnodeoPublicacao() >= anoInicial && l.getAnodeoPublicacao()<= anoFinal){
                    LivrosPorIntervaloAnos.add(l);

                }
            }
         }

        return LivrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroportitulo = null;
        if(!livrosList.isEmpty()){
            for(Livro l: livrosList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroportitulo=l;
                    break;
                }

            }
        }
        return livroportitulo;

    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Cthulu","HP.Lovecraft",1880);
        catalogoLivros.adicionarLivro("MazeRunner","Ema Lovewel",2015);
        catalogoLivros.adicionarLivro("MazeRunner 2","Ema Lovewel",2016);
        catalogoLivros.adicionarLivro("Thing","Jorge Marx",1950);

       System.out.println(catalogoLivros.pesquisarPorAutor("Ema Lovewel"));
       System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1800,2000));
       System.out.println(catalogoLivros.pesquisarPorTitulo("MazeRunner"));


    }
}
