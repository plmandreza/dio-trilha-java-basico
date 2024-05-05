public class ExemploBreakContinue {
	public static void main(String[] args) {
	
	for(int numero = 1; numero <= 5; numero ++){
		if(numero == 3)
			continue; //Muda o fluxo da iteração, não parou a execução do for completamente -> Não imprime o 3
            //break;
		System.out.println(numero);
		
	}
	//Qual a saída no console ?
    }
}