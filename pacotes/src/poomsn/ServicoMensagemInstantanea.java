package poomsn;

public class ServicoMensagemInstantanea { //herança
	public void enviarMensagem() {
		validarConectadoInternet(); //encapsulamento
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem(); //encapsulamento
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	//métodos privadas, visíveis somente na classe
	private void validarConectadoInternet() { //encapsulamento
		System.out.println("Validando se está conectado à internet");
	}
	private void salvarHistoricoMensagem() { //encapsulamento
		System.out.println("Salvando o histórico da mensagem");
	}
}
