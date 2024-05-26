package desafioiphone.smartphone;

public class AparelhoTelefonico {
	private String numero; 
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void ligar(String numero) {		
		System.out.println("Ligando para " + numero);
	}
	
	public void atender() {
		System.out.println("Atendendo chamada");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}
	
}
