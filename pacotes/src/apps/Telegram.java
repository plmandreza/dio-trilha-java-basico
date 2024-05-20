package apps;

public class Telegram extends ServicoMensagemInstantanea {
	public void enviarMensagem() { //abstração
		validarConectadoInternet(); //protected
		System.out.println("Enviando mensagem pelo Telegram");	
	}
	public void receberMensagem() { //abstração
		System.out.println("Recebendo mensagem pelo Telegram");	
	}
	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	} 
}
