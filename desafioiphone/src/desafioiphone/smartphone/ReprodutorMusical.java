package desafioiphone.smartphone;

public class ReprodutorMusical {
	private String musica;
	
	 String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}
	
	public void SelecionarMusica(String musica) {
		System.out.println("Selecionando música " + musica);
	}
	
	public void tocar() {
		System.out.println("Tocando música");
	}
	
	public void pausar() {
		System.out.println("Pausando música");
	}

}
