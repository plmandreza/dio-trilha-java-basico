package equipamentos.estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
//		Impressora impressora = new Deskjet();
//		
//		impressora.imprimir();
		
//		Scanner scanner = new Scanner();
//		
//		Impressora impressora = scanner; -> NÃO
//		Digitalizadora digitalizadora = scanner; -> SIM
//		Copiadora copiadora = scanner; -> NÃO
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Impressora impressora = em;	
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
//		Impressora impressora = new EquipamentoMultifuncional();
//		
//		impressora.imprimir();
	}

}
