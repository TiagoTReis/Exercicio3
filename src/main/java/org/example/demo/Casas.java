package org.example.demo;

public class Casas {
    // Atributos
    private String cor;
    private String tamanho;
    private String formato;

    // Construtor
    public Casas(String cor, String tamanho, String formato) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.formato = formato;
    }

    // Métodos getters e setters
    public String getcor() {
        return cor;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public String gettamanho() {
        return tamanho;
    }

    public void settamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getformato() {
        return formato;
    }

    public void setformato(String formato) {
        this.formato = formato;
    }

    // Método para morar na na casa
    public void morar() {
        System.out.println("Morar na casa!");
    }

    // Método para construir a casa
    public void construir() {
        System.out.println("Construir a casa");
    }

    // Método para pintar a casa
    public void pintar() {
        System.out.println("Pintar a casa");
    }

    // Método para exibir informações do casas
    @Override
    public String toString() {
        return "casas [cor=" + cor + ", tamanho=" + tamanho + ", formato=" + formato + "]";
    }

    // Método principal para testar a classe casas
    public static void main(String[] args) {
        // Criando um objeto casas
        Casas casas = new Casas("Amarela", "Grande", "Retangular");

        // Exibindo informações do casas
        System.out.println(casas);

        // Usando os métodos
        casas.construir();
        casas.morar();
        casas.pintar();
    }

}

