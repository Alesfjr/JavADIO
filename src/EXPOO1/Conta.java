package EXPOO1;

import java.util.Scanner;



public class Conta {
    static double saldo = 0.0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);



        while (true){
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("0 - Sair");
            int menu=scanner.nextInt();

            switch(menu){

                case 1:
                    ConsultarSaldo();
                    break;

                case 2:
                    ConsultarCheque();
                    break;

                case 3:
                    DepositarDinheiro();
                    break;

                case 4:

                    SacarDinheiro();
                    break;

                case 5 :

                    Pagarboleto();
                    break;

                case 0:
                    System.out.println("Saindo do sistema. Até mais!");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }

        }
    }

     static void ConsultarSaldo (){
        double limite;
        if (saldo<= 500)
            limite =50;
        else
            limite = saldo /2;

        double SaldoComLimite = saldo + limite;

        System.out.println("Seu saldo é :"+SaldoComLimite+" R$");
    }
     static void DepositarDinheiro(){
        System.out.println("Valor a depositar:");
        double deposito = scanner.nextDouble();
        saldo += deposito;
        if(deposito >0 )
            System.out.println("Valor de "+deposito+"R$ foi depositado com sucesso");
        else
            System.out.println("valor invalido");

     }
    static void ConsultarCheque(){
        double Pequenovalor = 50.0;
        double ValorProporcional = saldo/2;
         if ( saldo <= 500){
             System.out.println("Limite atual é :"+Pequenovalor+"R$");

         }
         else if (saldo > 500) {
             System.out.println("Limite atual é :"+ValorProporcional+"R$");

         }
         else{
             System.out.println("Limite indisponivel");
         }

    }
    static void SacarDinheiro(){
        System.out.println("Valor a sacar:");
        double saque= scanner.nextDouble();

        saldo -= saque;
        System.out.println("Saque realizado com sucesso.");


    }
   static void Pagarboleto(){
        System.out.println("Digitos do boleto:");
        System.out.println("valor do boleto:");
        double boleto=scanner.nextDouble();



        if (saldo > boleto){
            saldo -= boleto;
            System.out.println("Seu boleto de valor: "+boleto+" R$ foi pago!");
        }


        else if ( saldo < boleto){
            System.out.println("Saldo indisponivel.");
        }
        else
            System.out.println("Erro");


    }



}

