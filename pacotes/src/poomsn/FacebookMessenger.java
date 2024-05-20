package poomsn;

public class FacebookMessenger {
	public void enviarMensagem() {
		validarConectadoInternet(); //encapsulamento
		System.out.println("Enviando mensagem pelo Facebook Messenger");
		salvarHistoricoMensagem(); //encapsulamento
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem  pelo Facebook Messenger");
	}
	private void validarConectadoInternet() { //encapsulamento
		System.out.println("Validando se está conectado à internet");
	}
	private void salvarHistoricoMensagem() { //encapsulamento
		System.out.println("Salvando o histórico da mensagem");
	}
}
