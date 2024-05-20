package poomsn;

public class MSNMessenger extends ServicoMensagemInstantanea {
	public void enviarMensagem() { //abstração
		System.out.println("Enviando mensagem pelo MSN Messenger");	
	}
	public void receberMensagem() { //abstração
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	} 
}
