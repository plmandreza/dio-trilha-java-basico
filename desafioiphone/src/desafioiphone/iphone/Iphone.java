package desafioiphone.iphone;

import desafioiphone.smartphone.AparelhoTelefonico;
import desafioiphone.smartphone.NavegadorInternet;
import desafioiphone.smartphone.ReprodutorMusical;
import desafioiphone.smartphone.Smartphone;

public abstract class Iphone implements Smartphone {
	public static void main(String[] args) {

		ReprodutorMusical ipod = new ReprodutorMusical();
		
		ipod.SelecionarMusica("Boulevard of Broken Dreams - Green Day");
		
		ipod.tocar();
		
		ipod.pausar();
		
		NavegadorInternet safari = new NavegadorInternet();
		
		safari.exibirPagina("http://www.pudim.com");
		
		safari.adicionarNovaAba();
		
		safari.atualizarPagina();
		
		AparelhoTelefonico phone = new AparelhoTelefonico();
		
		phone.ligar("000-000-000");
		
		phone.atender();
		
		phone.iniciarCorreioVoz();
	
	}

}
