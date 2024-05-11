package br.com.dio.debugging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan); //método calculaMediaDaTurma() recebe array de alunos e fluxo do teclado
        //inicialmente era int
        System.out.printf("Média da turma %.2f", media); // inicialmente era d
        //2 casas decimais .2
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) { //inicialmente era int

            double soma = 0; //inicialmente era int
            for(String aluno : alunos) { //acessa cada elemento aluno do array alunos
                System.out.printf("Nota do aluno %s: ", aluno);
                double nota = scanner.nextDouble(); //inicialmente era int e nextInt
                soma += nota; //concatenação
                //atribui a uma variável o valor desta variável somada ao valor de um operando
            }

        return soma / alunos.length; //divisão do total da soma pela quantidade de alunos
    }

}
