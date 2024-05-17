package ibge;

//qualquer classe do sistema poderá obter os objetos de EstadoBrasileiro
public class SistemaIbge {
	public static void main(String[] args) {
		//imprimindo os estados existentes no enum
		for(EstadoBrasileiro uf: EstadoBrasileiro.values() ) {
			// percorre cada estado brasileiro denominado por "uf"
			System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
		}
				
		//selecionando um estado a partir das opções disponíveis
		//como se 5 "news" dos estados fossem salvos em uma variável global, que tem a lista dos estados, e está disponível em outro momento
			EstadoBrasileiro ufSelecionado = EstadoBrasileiro.CEARA;
				System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
				System.out.println(ufSelecionado.getSigla());
				System.out.println(ufSelecionado.getNomeMaiusculo());
				System.out.println(ufSelecionado.getIbge());
	}
}