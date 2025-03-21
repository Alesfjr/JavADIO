package org.aluno.vidaEscolar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class aluno {
    public static void main(String[] args) {


        String nome = "Alex";
        String nome2 ="Furtado";
        int idade = 25;
        String endereco = "Rua josé garibaldino,350";
        boolean status = true;

        String nomeCompleto = nomeCompleto("Nome:"+ nome,nome2);

        System.out.println(nomeCompleto);



    }
    public static String nomeCompleto( String nome, String nome2){

        return nome.concat(" ").concat(nome2);
    }

}