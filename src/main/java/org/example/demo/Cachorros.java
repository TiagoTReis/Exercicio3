package org.example.demo;

public class Cachorros {
    private int id;
    private String raca;
    private String peso;
    private String idade;

    public Cachorros(int id, String raca, String peso, String idade) {
        this.id = id;
        this.raca = raca;
        this.peso = peso;
        this.idade = idade;
    }

    public Cachorros(String raca, String peso, String idade) {
        this.raca = raca;
        this.peso = peso;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void latir() {
        System.out.println("O cachorro está latindo.");
    }

    public void correr() {
        System.out.println("O cachorro está correndo.");
    }
}
