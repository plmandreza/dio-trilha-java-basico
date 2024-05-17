package ibge;

public enum EstadoBrasileiro {
	//não são variáveis, são objetos preestabelecidos
	//não mudam com constância
	SAO_PAULO ("SP", "São Paulo", 35),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 33),
	PIAUI ("PI", "Piauí", 22),
	MARANHAO ("MA", "Maranhão", 21),
	CEARA ("CE", "Ceará", 23);
	
	private String nome;
	private String sigla;
	private int ibge;
	
	//construtor
	private EstadoBrasileiro (String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}
	public int getIbge() {
		return ibge;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}

}