package org.example.demo;

public class Frutas {
    // Atributos
    private String sabor;
    private String cor;
    private String textura;

    // Construtor
    public Frutas(String sabor, String cor, String textura) {
        this.sabor = sabor;
        this.cor = cor;
        this.textura = textura;
    }

    // Métodos getters e setters
    public String getsabor() {
        return sabor;
    }

    public void setsabor(String sabor) {
        this.sabor = sabor;
    }

    public String getcor() {
        return cor;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public String gettextura() {
        return textura;
    }

    public void settextura(String textura) {
        this.textura = textura;
    }

    // Método para comer o fruta
    public void comer() {
        System.out.println("Comer a fruta!");
    }

    // Método para pegar a fruta
    public void pegar() {
        System.out.println("Pegar a fruta");
    }

    // Método para lavar a fruta
    public void lavar() {
        System.out.println("Lavar a fruta");
    }

    // Método para exibir informações do frutas
    @Override
    public String toString() {
        return "frutas [sabor=" + sabor + ", cor=" + cor + ", textura=" + textura + "]";
    }

    // Método principal para testar a classe frutas
    public static void main(String[] args) {
        // Criando um objeto frutas
        Frutas frutas = new Frutas("doce", "amarela", "macio");

        // Exibindo informações do frutas
        System.out.println(frutas);

        // Usando os métodos
        frutas.pegar();
        frutas.comer();
        frutas.lavar();
    }

}
