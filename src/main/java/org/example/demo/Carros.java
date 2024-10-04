package org.example.demo;

public class Carros {
    // Atributos
    private String cor;
    private String marca;
    private String tipo;

    // Construtor
    public Carros(String cor, String marca, String tipo) {
        this.cor = cor;
        this.marca = marca;
        this.tipo = tipo;
    }

    // Métodos getters e setters
    public String getcor() {
        return cor;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    // Método para acelerar o carro
    public void acelerar() {
        System.out.println("Hora de acelerar!");
    }

    // Método para frear o carros
    public void frear() {
        System.out.println("Hora de frear o carro");
    }

    // Método para abastecer o carros
    public void abastecer() {
        System.out.println("Abastecer o carro");
    }

    // Método para exibir informações do carros

    public String toString() {
        return "carros [cor=" + cor + ", marca=" + marca + ", tipo=" + tipo + "]";
    }

    // Método principal para testar a classe carros
    public static void main(String[] args) {
        // Criando um objeto carros
        Carros carros = new Carros("Azul", "Porsche", "Esportivo");

        // Exibindo informações do carros
        System.out.println(carros);

        // Usando os métodos
        carros.frear();
        carros.acelerar();
        carros.abastecer();
    }

}
