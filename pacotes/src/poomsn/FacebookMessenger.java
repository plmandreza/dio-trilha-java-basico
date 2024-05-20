package poomsn;

public class FacebookMessenger extends ServicoMensagemInstantanea { //herança 
	public void enviarMensagem() { //abstração
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() { //abstração
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
}
