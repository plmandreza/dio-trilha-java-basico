package desafiobanco;

public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		Cliente cliente1 = new Cliente("João");
		banco.adicionarCliente(cliente1);
		
		Conta cc1 = new ContaCorrente(cliente1);
		cc1.depositar(100);
		
		Conta poupanca1 = new ContaPoupanca(cliente1);

		cc1.transferir(50, poupanca1);
		
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();
		
		Cliente cliente2 = new Cliente("Maria");
		banco.adicionarCliente(cliente2);
		
		Conta cc2 = new ContaCorrente(cliente2);
		cc2.depositar(50);
		
		Conta poupanca2 = new ContaPoupanca(cliente2);

		cc2.transferir(50, poupanca2);
		
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();
		
		banco.listarClientes();
	}

}
