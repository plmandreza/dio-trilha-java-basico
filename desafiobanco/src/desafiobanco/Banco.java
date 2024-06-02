package desafiobanco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Cliente> clientes;

	public Banco() {
		this.clientes = new ArrayList<>();
	}

	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}


	public void listarClientes() {
		System.out.println("Lista de Clientes:");
		for (Cliente cliente : clientes) {
			System.out.println("Nome: " + cliente.getNome());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}