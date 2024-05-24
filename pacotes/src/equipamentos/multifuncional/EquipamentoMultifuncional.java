package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {
	//Java não permite herança múltipla
	//Interface serve para uma classe ter características de outras classes
	//É o nível mais abstrato do mundo real
	
	//@Override //Sobrescrita do método (herda de algum lugar e implementa)
	public void copiar() {
		System.out.println("Copiando via equipamento multifuncional");
	}

	public void digitalizar() {
		System.out.println("Digitalizando via equipamento multifuncional");
	}

	public void imprimir() {
		System.out.println("Imprimindo via equipamento multifuncional");
	}
	
}
