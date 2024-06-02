package desafiobanco;

public interface IConta { 
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino); //IConta contaDestino
	
	void imprimirExtrato();
}
