package exiNTERFACES;

import java.util.Scanner;

public class Main {
    private final static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int menu =-1;
        GeometricForm geometricForm =null ;

        while (true){
            System.out.println("Escolha a forma geometrica para se calcular a área ");
            System.out.println("1- Quadrado ");
            System.out.println("2- Circlo ");
            System.out.println("3- Retanglo  ");
            System.out.println("0-Sair ");
            menu =scn.nextInt();

            if (menu == 0) {
                break;
            }
            switch (menu) {
                case 1:
                    geometricForm = createSquare();
                    break;
                case 2:
                    geometricForm = createCircle();
                    break;
                case 3:
                    geometricForm = createRectangle();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }



            System.out.println("O resulatdo é :"+geometricForm.getAre());
        }
        scn.close();
    }
    private  static  GeometricForm createSquare(){
        System.out.println("informe o tamanho dos lados:");
        var side = scn.nextDouble();
        return new Square(side);
    }
    private  static  GeometricForm createRectangle(){
        System.out.println("informe a altura:");
        var height = scn.nextDouble();
        System.out.println("informe o tamanho da base:");
        var base = scn.nextDouble();

        return new Rectangle(height,base);

    } private static GeometricForm createCircle(){
        System.out.println("informe p raio:");
        var radious = scn.nextDouble();

        return new Circle(radious);

    }

}
