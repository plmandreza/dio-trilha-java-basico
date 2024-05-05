import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();   
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos.");
        }
    }
}
//Tratamento para a exceção java.util.InputMismatchException etc.

/*
 * try {
 * //  bloco de código conforme esperado
 * }
 * catch(Exception e) {// precisamos saber qual exceção
 * // bloco de código que captura as exceções que podem acontecer
 * // em caso de um fluxo não previsto
 * }
 *
 * A instrução finally, permite definir um bloco de código a ser executado, 
 * independente de ocorrer um erro ou não. É OPCIONAL.
 */

 /*
  * Hierarquia das exceções:
  * Checked and Unchecked Exceptions (Se são previstas ou não)
  * Throwable <- Error
  * Throwable <- Excepction
  *     Exception <-  RuntimeException <- ou IOException...
  */