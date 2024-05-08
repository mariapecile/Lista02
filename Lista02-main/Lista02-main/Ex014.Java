import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        System.out.println("Por favor, insira os 5 elementos do vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        int max = vetor[0];
        int posicaoMax = 0;
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
                posicaoMax = i;
            }
        }
        

        int temp = vetor[4];
        vetor[4] = max;
        vetor[posicaoMax] = temp;
        
        System.out.println("O vetor atualizado é:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        scanner.close();
    }
}