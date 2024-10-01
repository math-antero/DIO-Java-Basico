import java.util.Scanner;

/**
 * contador
 */
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        // Corrigindo a contagem para incluir ambos os extremos
        int contagem = parametroDois - parametroUm + 1;

        // Imprimindo os números do intervalo
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println( "Imprimindo paramêtro " + i);
        }
    }
}