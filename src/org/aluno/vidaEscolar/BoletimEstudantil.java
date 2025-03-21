package org.aluno.vidaEscolar;

public class BoletimEstudantil {
    public static void main(String[] args) {

        int mediaFinal =1;
        if(mediaFinal<6)
            System.out.println("REPROVADO...");
        else if(mediaFinal == 6)
            System.out.println("PASSOU JUSTO HIEN.");
        else
            System.out.println("PARABENS, FOI APROVADO!");
    }
}
