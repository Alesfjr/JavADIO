package ProjetoSeletivo;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class PSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {
                "João Silva", "Maria Souza", "Carlos Oliveira", "Ana Pereira", "Pedro Santos"
        };

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato) {
        int tentativas = 1;
        boolean continuarTentativas = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentativas = !atendeu;

            if (continuarTentativas) {
                tentativas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        } while (continuarTentativas && tentativas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA TENTATIVA " + tentativas);
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " APÓS " + tentativas + " TENTATIVAS");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 0;
    }

    static void imprimirCandidatos() {
        String[] candidatos = {
                "João Silva", "Maria Souza", "Carlos Oliveira", "Ana Pereira", "Pedro Santos",
                "Juliana Costa", "Fernando Almeida", "Beatriz Lima", "Rafael Mendes", "Larissa Rocha"
        };

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento:");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato nº " + i + " é " + candidatos[i]);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {
                "João Silva", "Maria Souza", "Carlos Oliveira", "Ana Pereira", "Pedro Santos",
                "Juliana Costa", "Fernando Almeida", "Beatriz Lima", "Rafael Mendes", "Larissa Rocha"
        };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este salário: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("CANDIDATO SELECIONADO");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        double valor = ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
        return Math.round(valor * 100.0) / 100.0; // Arredonda para 2 casas decimais
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO PARA CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
