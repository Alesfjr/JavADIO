package Repeticioes;
import java.util.concurrent.ThreadLocalRandom;
public class exemploWhile {
    public static void main(String[] args) {
        double mesada =50.00;
        while (mesada >0){
            Double valorDoce = valorAleatorio();
            if(valorDoce >mesada)
                valorDoce=mesada;

            System.out.println("Doce do valor:"+ valorDoce+" Adicionado no carrinho");
            mesada=mesada-valorDoce;
        }
        System.out.println("Mesada:"+mesada);
        System.out.println("Joãozinho gastou toda sua mesada");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
