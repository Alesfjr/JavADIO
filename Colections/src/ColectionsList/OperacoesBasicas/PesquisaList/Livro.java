package ColectionsList.OperacoesBasicas.PesquisaList;

public class Livro {
    private String titulo;
    private String autor;
    private int anodeoPublicacao;

    public Livro(String titulo, String autor, int anodeoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anodeoPublicacao = anodeoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnodeoPublicacao() {
        return anodeoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anodeoPblicacao=" + anodeoPublicacao +
                '}';
    }
}
