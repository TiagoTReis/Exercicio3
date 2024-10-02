
package org.example.demo;

public class Cachorros {
    // Atributos
    private String raca;
    private String peso;
    private String idade;

    // Construtor
    public Cachorros(String raca, String peso, String idade) {
        this.raca = raca;
        this.peso = peso;
        this.idade = idade;
    }

    // Métodos getters e setters
    public String getraca() {
        return raca;
    }

    public void setraca(String raca) {
        this.raca = raca;
    }

    public String getpeso() {
        return peso;
    }

    public void setpeso(String peso) {
        this.peso = peso;
    }

    public String getidade() {
        return idade;
    }

    public void setidade(String idade) {
        this.idade = idade;
    }

    // Método para dormir com o cachorros
    public void dormir() {
        System.out.println("Cachorro Dormindo!");
    }

    // Método para latir o cachorros
    public void latir() {
        System.out.println("Cachorro latindo.");
    }

    // Método para correr o cachorros
    public void correr() {
        System.out.println("Cachorro correndo.");
    }

    // Método para exibir informações do cachorros
    @Override
    public String toString() {
        return "cachorros [raca=" + raca + ", peso=" + peso + ", idade=" + idade + "]";
    }

    // Método principal para testar a classe cachorros
    public static void main(String[] args) {
        // Criando um objeto cachorros
        Cachorros cachorros = new Cachorros("Doberman", "40", "4");

        // Exibindo informações do cachorros
        System.out.println(cachorros);

        // Usando os métodos
        cachorros.latir();
        cachorros.dormir();
        cachorros.correr();
    }
}


