public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" }; //Conjunto de elementos do tipo String
    
        for (int x = 0; x < alunos.length; x++) { //Em Arrays, o índice inicia em 0
            System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
        }
    }
} 