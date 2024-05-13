import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();

        double saldoDiario = limiteDiario;

        for (int i = 1; i <= 3; i++) {
            double valorSaque = scanner.nextDouble();

            if (valorSaque <= 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            if (valorSaque > saldoDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

            saldoDiario -= valorSaque;
            System.out.println("Saque realizado. Limite restante: " + saldoDiario);
        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close(); 
    }
}
