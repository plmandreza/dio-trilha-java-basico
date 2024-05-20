package pilarespoo;

public class Moto extends Veiculo { //herança
	//classe especializada
	
	@Override 
	public void ligar() { //abstração
		System.out.println("Moto ligada");
	}
}
