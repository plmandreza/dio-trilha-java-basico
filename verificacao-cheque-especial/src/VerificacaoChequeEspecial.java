import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Informe o saldo atual da conta bancária:");
        double saldo = scanner.nextDouble();

        //System.out.println("Informe o valor de saque que deseja realizar:");
        double saque = scanner.nextDouble();

        double limiteChequeEspecial = 500.0;

        if (saque <= saldo) {
            System.out.println("Transacao realizada com sucesso.");
        } else if (saque > saldo && saque > saldo + limiteChequeEspecial) {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        } else {
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        }
        scanner.close();
    }
}