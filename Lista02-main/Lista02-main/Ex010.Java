import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] A = new int[5];
        int[] B = new int[5];
        
        System.out.println("Por favor, insira os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            B[i] = A[4 - i];
        }
        
        System.out.println("O vetor B, com os elementos de A invertidos, é:");
        for (int i = 0; i < 5; i++) {
            System.out.print(B[i] + " ");
        }
        
        scanner.close();
    }
}