import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // vetores A, B e C
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10]; // vetor C terá tamanho 10 pois são 5 elementos de A e 5 de B
        
        // usuario colocar elementos do vetor A
        System.out.println("Por favor, insira os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }
        
        // = elementos do vetor B
        System.out.println("Agora, insira os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            B[i] = scanner.nextInt();
        }
        
        // A e B para = o vetor C
        for (int i = 0; i < 5; i++) {
            C[i] = A[i];
            C[i + 5] = B[i];
        }
        
        // o vetor C
        System.out.println("O vetor C, que representa a concatenação de A e B, é:");
        for (int i = 0; i < 10; i++) {
            System.out.print(C[i] + " ");
        }
        
        scanner.close();
    }
}