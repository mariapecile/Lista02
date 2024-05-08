import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // vetores para armazenar as notas e os pesos
        double[] notas = new double[5];
        double[] pesos = new double[5];
        
        // pedindo ao usuário que coloque as notas do aluno
        System.out.println("Por favor, digite as 5 notas do aluno:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        
        // = os pesos das notas
        System.out.println("Agora, digite os 5 pesos correspondentes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Peso " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
        }
        
        // calculando a média do aluno
        double somaNotasPonderadas = 0;
        double somaPesos = 0;
        for (int i = 0; i < 5; i++) {
            somaNotasPonderadas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        
        double mediaPonderada = somaNotasPonderadas / somaPesos;
        
        // a média ponderada do aluno
        System.out.println("A média ponderada do aluno é: " + mediaPonderada);
        
        scanner.close();
    }
}