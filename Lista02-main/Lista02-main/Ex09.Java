import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10]; // vetor C terá tamanho 10 pois são 5 elementos de A e 5 de B
        
        System.out.println("Por favor, insira os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }
        

        System.out.println("Agora, insira os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            B[i] = scanner.nextInt();
        }
        
        // regras especificadas
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) { // posições pares
                C[i * 2] = A[i];
            } else { // posições ímpares
                C[(i - 1) * 2 + 1] = B[i];
            }
        }
        
        // vetor C
        System.out.println("O vetor C, conforme as regras especificadas, é:");
        for (int i = 0; i < 10; i++) {
            System.out.print(C[i] + " ");
        }
        
        scanner.close();
    }
}