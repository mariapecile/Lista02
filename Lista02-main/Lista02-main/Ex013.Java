import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // usuário insire o número de termos desejados
        System.out.println("Por favor, digite o número de termos da sequência de Fibonacci que deseja gerar:");
        int n = scanner.nextInt();
        
        // vetor para armazenar os termos 
        int[] fibonacci = new int[n];
        
        // primeiros termos 
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        
        // mostrando os termos
        System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        
        scanner.close();
    }
}