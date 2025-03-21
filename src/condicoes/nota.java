package condicoes;

public class nota {
    public static void main(String[] args) {

        int nota =5;
        int nota2 =7;
        String resultado = nota2 >= 7 ? "Aprovado" : "Reprovado";

        if (nota >= 7)
            System.out.println("Aprovado");

        else if (nota >=5 && nota <7)
            System.out.println("Recuperação");

        else
            System.out.println("Reprovado");

        System.out.println(resultado);
    }
}
