package pilarespoo;

public abstract class Veiculo { //abstração
	//"não precisa saber como as coisas funcionam"
	//classe genérica
	private String chassi; //herança
	
	public String getChassi() { 
		return chassi;
	}
	public void setChassi(String chassi) { 
		this.chassi = chassi;
	}
	public abstract void ligar(); //abstração
		//"mas todo veículo precisa ligar"
}
