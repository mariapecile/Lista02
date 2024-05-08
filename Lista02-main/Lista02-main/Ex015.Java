import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        int[] vetor = new int[5];
        
        System.out.print("Por favor, digite o primeiro número: ");
        vetor[0] = scanner.nextInt();
        
        for (int i = 1; i < 5; i++) {
            System.out.print("Digite o próximo número: ");
            int num = scanner.nextInt();
            if (num > vetor[i - 1]) {
                vetor[i] = num;
            } else {
                System.out.println("O número digitado não é maior que o anterior. Por favor, tente novamente.");
                i--; 
            }
        }
    
        System.out.println("O vetor preenchido é:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        scanner.close();
    }
}