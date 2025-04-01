package POO;

public class aluno {
    private String nome ;
    private int idade ;
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNome(){
        //pode se definir alguma condição//  if (getNome().length()<5)
        //    System.out.println("CANCELAR INSCRIÇÃO");

        return nome;
    }
    public void setNome(String newNome){
        nome= newNome;
    }
    public int  getIdade(){
       //if (getIdade() >10)
        //System.out.println("CANCELAR INSCRIÇÃO");
        return idade;
    }
    public void setIdade(int newIdade){
        idade =newIdade;
    }
}
