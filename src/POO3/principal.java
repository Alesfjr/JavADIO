package POO3;
import java.util.Scanner;

public class principal {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {


        Employee employee = new Employee();
        Manager manager = new Manager();
        manager.setPassaword("123");



        System.out.println("Nome Completo: ");
        String nomeManager = scn.nextLine();
        manager.setName(nomeManager);

        System.out.println("Escreva o login desejado: ");
        String loginManager = scn.nextLine();
        manager.setLogin(loginManager);
        System.out.println("Seu login: "+manager.getLogin());



        while (true){

            System.out.println("Digite sua senha: ");
            String pwdManager = scn.nextLine();

            if (pwdManager.equals(manager.getPassaword()) ){
                System.out.println("Acesso autorizado");
                break;
            }
            else{
                System.out.println("Acesso negado");
            }
        }



    }
}
