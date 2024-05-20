package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea { //herança 
	public void enviarMensagem() { //abstração
		validarConectadoInternet(); //protected
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() { //abstração
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	}
}
