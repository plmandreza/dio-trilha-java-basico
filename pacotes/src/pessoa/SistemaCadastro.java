package pessoa;

public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa marcos = new Pessoa("123", "Marcos"); //garante que informemos dados/atributos relevantes para a criação do obj na inicialização 
		
		marcos.setEndereco("RUA DAS MARIAS");
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}
