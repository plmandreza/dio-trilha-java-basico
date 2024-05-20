package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {
	public void enviarMensagem() { //abstração
		validarConectadoInternet(); //protected
		System.out.println("Enviando mensagem pelo MSN Messenger");	
	}
	public void receberMensagem() { //abstração
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	} 
}
