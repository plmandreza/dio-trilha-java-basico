package pilarespoo;

public class Carro extends Veiculo { //herança
	//classe especilizada
	public void ligar() {
		confereCambio(); //encapsulamento
		confereCombustivel(); //encapsulamento
		System.out.println("Carro ligado");
	}
	private void confereCombustivel() {
		System.out.println("Conferindo combustível");
	}
	private void confereCambio() {
		System.out.println("Conferindo câmbio em P");
	}
}