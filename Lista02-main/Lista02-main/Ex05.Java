import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        System.out.println("Por favor, insira 5 números:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        // pedindo ao usuário que insira um número n
        System.out.print("Agora, insira um número qualquer (n): ");
        int n = scanner.nextInt();
        
        // contando quantas vezes o número n aparece no vetor
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            if (vetor[i] == n) {
                contador++;
            }
        }
        
        // quantidade de vezes que o número n aparece no vetor
        System.out.println("O número " + n + " aparece " + contador + " vezes no vetor.");
        
        scanner.close();
    }
}