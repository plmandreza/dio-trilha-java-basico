package pilarespoo;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("897897"); 
		//jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("467754"); 
		//z400.ligar(); //abstração
		
		//Veiculo coringa = jeep; 
		Veiculo coringa = z400; //polimorfismo e abstração
		
		coringa.ligar();
		//"mantém  o método, porém não sabe qual será o comportamento"
	}
}
