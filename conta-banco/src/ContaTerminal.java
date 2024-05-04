import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //cria o objeto scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo(a) ao nosso banco.");

        System.out.println("Por favor, digite o número da agência.");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta.");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome.");
        String nomeCliente = scanner.next();
            
        System.out.println("Por favor, digite o valor de depósito.");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        //fecha o objeto scanner 
        scanner.close(); 

    }
}

/*
 * int numero = 1021;
 * String agencia = "067-8";
 * String nomeCliente = "MARIO ANDRADE";
 * double saldo = 237.48;
 */