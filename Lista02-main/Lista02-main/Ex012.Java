import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[12];
        
        System.out.println("Por favor, insira os 12 elementos do vetor:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        // calculando o produto dos elementos pares positivos
        int produto = 1;
        for (int i = 0; i < 12; i++) {
            if (vetor[i] > 0 && vetor[i] % 2 == 0) { 
                produto *= vetor[i];
            }
        }
        
        // o resultado
        System.out.println("O produto dos elementos pares positivos é: " + produto);
        
        scanner.close();
    }
}