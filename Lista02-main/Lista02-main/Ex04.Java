import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        //lendo os n e adicionando ao vetor
        
        System.out.println("Por favor, digite 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        System.out.print("Agora, digite um número qualquer (n): ");
        int n = scanner.nextInt();
        
        System.out.println("Elementos do vetor inferiores a " + n + ":");
        for (int i = 0; i < 5; i++) {
            if (vetor[i] < n) {
                System.out.println("Índice " + i + ": " + vetor[i]);
            }
        }
        
        scanner.close();
    }
}