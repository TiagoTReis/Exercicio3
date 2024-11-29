package org.example.demo;

public class Casas {
    // Atributos
    private int id;
    private String cor;
    private String tamanho;
    private String formato;

    // Construtores
    public Casas(int id, String cor, String tamanho, String formato) {
        this.id = id;
        this.cor = cor;
        this.tamanho = tamanho;
        this.formato = formato;
    }

    public Casas(String cor, String tamanho, String formato) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.formato = formato;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }


    public void morar() {
        System.out.println("Morar na casa!");
    }

    public void construir() {
        System.out.println("Construir a casa!");
    }

    public void pintar() {
        System.out.println("Pintar a casa!");
    }


    @Override
    public String toString() {
        return "Casa [id=" + id + ", cor=" + cor + ", tamanho=" + tamanho + ", formato=" + formato + "]";
    }


    public static void main(String[] args) {
        // Criando objetos Casas
        Casas casa1 = new Casas("Amarela", "Grande", "Retangular");
        Casas casa2 = new Casas(1, "Verde", "Pequena", "Quadrada");


        System.out.println(casa1);
        System.out.println(casa2);


        casa1.construir();
        casa2.morar();
        casa1.pintar();
    }
}
