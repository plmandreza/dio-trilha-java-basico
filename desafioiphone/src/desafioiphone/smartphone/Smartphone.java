package desafioiphone.smartphone;

public interface Smartphone {
	
	public void SelecionarMusica(String musica);
	
	public void tocar();
	
	public void pausar();
	
	public void exibirPagina(String url);
	
	public void adicionarNovaAba();
	
	public void atualizarPagina();
	
	public void ligar(String numero);
	
	public void atender();
	
	public void iniciarCorreioVoz();
}
