import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor;

        try {
            valor = NumberFormat.getInstance().parse("a1.75"); //Unhandled exception type ParseExceptionJava(16777384)
            System.out.println(valor);
        } catch (ParseException e){
            e.printStackTrace();  
        }
    }
} 
//Unchecked -> erros precisam ser tratados imediatamente