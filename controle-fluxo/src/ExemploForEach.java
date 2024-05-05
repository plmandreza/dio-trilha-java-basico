public class ExemploForEach {
    public static void main(String[] args) { //Array ou coleção
        String alunos[] =  {"FELIPE","JONAS","JULIA","MARCOS"}; //A iteração é baseada em seus elementos

        //Forma abreviada
        for(String aluno : alunos) { //A cada excecução, a variável "aluno" obtém um novo valor
          System.out.println("O nome do aluno é: " + aluno);
        }
    }
}