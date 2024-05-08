import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // vetores para armazenar os elementos
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        
        // pedindo ao usuário que coloque os elementos do primeiro vetor
        System.out.println("Por favor, insira os elementos do primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }
        
        // = segundo vetor
        System.out.println("Agora, insira os elementos do segundo vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }
        
        // vendo se os vetores são iguais
        boolean saoIguais = true;
        for (int i = 0; i < 5; i++) {
            if (vetor1[i] != vetor2[i]) {
                saoIguais = false;
                break;
            }
        }
        
        // resultado
        if (saoIguais) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores são diferentes.");
        }
        
        scanner.close();
    }
}