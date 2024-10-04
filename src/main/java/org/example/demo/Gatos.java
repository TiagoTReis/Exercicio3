package org.example.demo;

public class Gatos {
    // Atributos
    private String raca;
    private String cor;
    private String tamanho;

    // Construtor
    public Gatos(String raca, String cor, String tamanho) {
        this.raca = raca;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    // Métodos getters e setters
    public String getraca() {
        return raca;
    }

    public void setraca(String raca) {
        this.raca = raca;
    }

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

    // Método para miar os gatos
    public void miar() {
        System.out.println("O gatinho esta miando");
    }

    // Método para arranhar a gatos
    public void arranhar() {
        System.out.println("O gatinho esta arranhando");
    }

    // Método para comer a gatos
    public void comer() {
        System.out.println("Gato comendo");
    }

    // Método para exibir informações do gatoss
    @Override
    public String toString() {
        return "gatos [raca=" + raca + ", cor=" + cor + ", tamanho=" + tamanho + "]";
    }

    // Método principal para testar a classe gatoss
    public static void main(String[] args) {
        // Criando um objeto gatoss
        Gatos gatoss = new Gatos("persa", "cinza", "pequeno");

        // Exibindo informações do gatoss
        System.out.println(gatoss);

        // Usando os métodos
        gatoss.arranhar();
        gatoss.miar();
        gatoss.comer();
    }
}


