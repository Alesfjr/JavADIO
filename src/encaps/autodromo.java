package encaps;
import encaps.carro;

public class autodromo  {
    public static void main(String[] args) {
        carro corsa= new carro();

        corsa.setChasssi("1547785");

        corsa.confereCambio();
        corsa.confereCombustivel();
        corsa.ligar();
    }

}
