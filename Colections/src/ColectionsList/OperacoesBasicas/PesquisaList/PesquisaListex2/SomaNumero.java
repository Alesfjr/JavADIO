package ColectionsList.OperacoesBasicas.PesquisaList.PesquisaListex2;

import java.util.ArrayList;
import java.util.List;

public class SomaNumero {
    private List<Integer> numeros;

    public SomaNumero(){
        this.numeros= new ArrayList<>();
    }
    public int adicionarNumero(int numero){

        numeros.add(numero);

        return numero;
    }
    public int calcularSoma(){
        int total = 0;
        for (int n: numeros){
            total += n;

        }
        return total;

    }
    public int encontrarMaiorNumero() {
        if (numeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia!");
        }
        int maior = numeros.get(0);
        for (int n :  numeros){
            if (n >maior){
                maior = n;

            }
        }
        return maior;

    }
    public  int encontrarMenorNumero(){
        if (numeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia!");
        }
        int menor = numeros.get(0);
        for (int n :  numeros){
            if (n < menor){
                menor = n;

            }
        }
        return menor;

    }
    public List<Integer> exibirNumeros() {
        return new ArrayList<>(numeros);
    }
    public static void main(String[] args) {
        SomaNumero soma = new SomaNumero();

        soma.adicionarNumero(10);
        soma.adicionarNumero(25);
        soma.adicionarNumero(3);
        soma.adicionarNumero(18);

        System.out.println("Números: " + soma.exibirNumeros());
        System.out.println("Soma: " + soma.calcularSoma());
        System.out.println("Maior número: " + soma.encontrarMaiorNumero());
        System.out.println("Menor número: " + soma.encontrarMenorNumero());
    }

}
