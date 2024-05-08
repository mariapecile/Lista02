import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        // primeiro vetor
        int[] primeiroVetor = new int[tamanho];
        
        // segundo vetor 
        int[] segundoVetor = new int[tamanho];

        System.out.println("Digite os números do primeiro vetor:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i+1) + ": ");
            primeiroVetor[i] = scanner.nextInt();
            
            // armazena o dobro de cada número no segundo vetor
            segundoVetor[i] = primeiroVetor[i] * 2;
        }

        // valores do segundo vetor
        System.out.println("Valores do segundo vetor (dobro dos valores do primeiro vetor):");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(segundoVetor[i]);
        }

        scanner.close();
    }
}