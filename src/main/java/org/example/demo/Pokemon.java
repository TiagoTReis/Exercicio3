package org.example.demo;

public class Pokemon {
    // Atributos
    private String cor;
    private String tipo;
    private String peso;

    // Construtor
    public Pokemon(String cor, String tipo, String peso) {
        this.cor = cor;
        this.tipo = tipo;
        this.peso = peso;
    }

    // Métodos get e set
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    // Método para capturar os pokemon
    public void capturar() {
        System.out.println("capturar os pokemon!");
    }

    // Método para lutar os pokemon
    public void lutar() {
        System.out.println("lutar os pokemon!");
    }

    // Método para defender o pokemon
    public void defender() {
        System.out.println("defender os pokemon !");
    }

    // Método para exibir informações do pokemon

    public String toString() {
        return "pokemon [cor=" + cor + ", tipo=" + tipo + ", peso=" + peso + "]";
    }

    // Método principal para testar a classe pokemon
    public static void main(String[] args) {
        // Criando um objeto pokemon
        Pokemon pokemon = new Pokemon("amarelo", "eletrico", "6kg");

        // Exibindo informações do pokemon
        System.out.println(pokemon);

        // Usando os métodos
        pokemon.lutar();
        pokemon.capturar();
        pokemon.defender();
    }
}

