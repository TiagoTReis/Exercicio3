package org.example.demo;

public class Times {
    // Atributos
    private String regiao;
    private String cor;
    private String estadio;

    // Construtor
    public Times(String regiao, String cor, String estadio) {
        this.regiao = regiao;
        this.cor = cor;
        this.estadio = estadio;
    }

    // Métodos getters e setters
    public String getregiao() {
        return regiao;
    }

    public void setregiao(String regiao) {
        this.regiao = regiao;
    }

    public String getcor() {
        return cor;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public String getestadio() {
        return estadio;
    }

    public void setestadio(String estadio) {
        this.estadio = estadio;
    }

    // Método para jogar o time
    public void jogar() {
        System.out.println("Bora jogar no time!");
    }

    // Método para ganhar a time
    public void ganhar() {
        System.out.println("Bora ganhar time");
    }

    // Método para perder a time
    public void perder() {
        System.out.println("Para o time perder");
    }

    // Método para exibir informações do times
    @Override
    public String toString() {
        return "times [regiao=" + regiao + ", cor=" + cor + ", estadio=" + estadio + "]";
    }

    // Método principal para testar a classe times
    public static void main(String[] args) {
        // Criando um objeto times
        Times times = new Times("Rio de Janeiro", "Vermelho", "Maracana");

        // Exibindo informações do times
        System.out.println(times);

        // Usando os métodos
        times.ganhar();
        times.jogar();
        times.perder();
    }
}

