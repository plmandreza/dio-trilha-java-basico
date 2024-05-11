//Pilha de execução de um programa Java
package br.com.dio.debugging;

public class Main { //programa java começa e termina no método main
    public static void main(String[] args) {
        System.out.println("Início do programa no método main");
        a();
        System.out.println("Finalização do programa no método main");
    }
    //métodos a, b, c
    static void a() { //public static void a()
        System.out.println("Entrou no método a");
        b();
        System.out.println("Finalizou o método a");
    }

    static void b() {
        System.out.println("Entrou no método b");
        for(int i = 0; i <= 4; i++) System.out.println(i); //laço de repetição imprime 0, 1, 2 e 3
        c();
        System.out.println("Finalizou o método b");
    }

    static void c() {
        System.out.println("Entrou no método c");
        Thread.dumpStack(); //para depuração do código -> ler de baixo para cima
        System.out.println("Finalizou o método c");
    }
}