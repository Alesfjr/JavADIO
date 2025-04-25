package ColectionsSet.operacoesBasicas;

public class Convidado {
    private String nome;
    private int codigo;

    public Convidado(String nome,int codigo){
        this.nome=nome;
        this.codigo =codigo;

    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", condigo=" + codigo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
