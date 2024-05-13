import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {
            // Exibe o menu
           /* System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar"); */ 

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    //System.out.println("Digite o valor a ser depositado:");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                
                case 2:
                    //System.out.println("Digite o valor a ser sacado:");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saldo atual: " + saldo); //Saque realizado com sucesso. 
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                
                case 0:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}