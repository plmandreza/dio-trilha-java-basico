package poomsn;

public class Telegram extends ServicoMensagemInstantanea {
	public void enviarMensagem() { //abstração
		System.out.println("Enviando mensagem pelo Telegram");	
	}
	public void receberMensagem() { //abstração
		System.out.println("Recebendo mensagem pelo Telegram");	
	} 
}
