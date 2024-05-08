import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Por favor, digite 5 números:");

        // lendo os n° enviados pelo usuario
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // calculo
        double soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        double media = soma / numeros.length;

        System.out.println("A média dos números é: " + media);

        System.out.println("Números menores que a média:");
        for (int numero : numeros) {
            if (numero < media) {
                System.out.println(numero);
            }
        }

        System.out.println("Números iguais à média:");
        for (int numero : numeros) {
            if (numero == media) {
                System.out.println(numero);
            }
        }

        System.out.println("Números maiores que a média:");
        for (int numero : numeros) {
            if (numero > media) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}