public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //métodos que manipulam os estados
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Mudando para o canal: " + canal);
    }
    public void aumentarCanal() {
        canal++; // operador unário
        System.out.println("Mudando para o canal: " + canal);
    }
    public void diminuirCanal() {
        canal--; // operador unário
        System.out.println("Mudando para o canal: " + canal);
    }
    public void aumentarVolume() {
        volume++; // operador unário
        System.out.println("Aumentando o volume para: " + volume); 
    }
    public void diminuirVolume() {
        volume--; // operador unário
        System.out.println("Diminuindo o volume para: " + volume);
    }   
    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
}
