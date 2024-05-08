import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // pede o tamanho do vetor 
        System.out.print("Por favor, insira o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        // cria o vetor com o tamanho pedido pelo usuário
        int[] vetor = new int[tamanho];

        // pede que o usuário coloque os números no vetor
        System.out.println("Digite os elementos do vetor:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // mostra se cada número é positivo, negativo ou zero
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > 0) {
                System.out.println("O número " + vetor[i] + " na posição " + i + " é positivo.");
            } else if (vetor[i] < 0) {
                System.out.println("O número " + vetor[i] + " na posição " + i + " é negativo.");
            } else {
                System.out.println("O número " + vetor[i] + " na posição " + i + " é zero.");
            }
        }

        scanner.close();
    }
}