package lanchonete.atendimento.cozinha;

public class Almoxarife {
	public void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	public void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	void entregarIngredientes() { //default -> restringe a visibilidade por pacotes
		System.out.println("ENTREGANDO INGREDIENTES");
		//...?
	}
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}