package condicoes;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo =25.00;

        System.out.println("Sacar:");
        double valorSolicitado = scanner.nextDouble();
        if (valorSolicitado< saldo)
            saldo = saldo -valorSolicitado;

        else if(valorSolicitado > saldo)
            System.out.println("Saldo insuficiente.");


        System.out.println("Saldo atual: "+saldo);

    }
}
