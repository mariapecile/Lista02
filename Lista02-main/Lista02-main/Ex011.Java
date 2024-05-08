import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] A = new int[5];
        int[] B = new int[5];
        
        // usuario vetor A
        System.out.println("Por favor, insira os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }
        
        // usuario vetor B
        System.out.println("Agora, insira os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            B[i] = scanner.nextInt();
        }
        
        int produtoEscalar = 0;
        for (int i = 0; i < 5; i++) {
            produtoEscalar += A[i] * B[i];
        }
        
        System.out.println("O produto escalar entre os vetores A e B é: " + produtoEscalar);
        
        scanner.close();
    }
}