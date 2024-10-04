package org.example.demo;

public class InstrumentosMusicais {
    // Atributos
    private String tipo;
    private String tamanho;
    private String material;

    // Construtor
    public InstrumentosMusicais(String tipo, String tamanho, String material) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.material = material;
    }

    // Métodos get e set
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Método para tocar os instrumentos musicais
    public void tocar() {
        System.out.println("Bora tocar os instrumentos musicais !");
    }

    // Método para afinar os instrumentos musicais
    public void afinar() {
        System.out.println("Vamos afinar os instrumentos musicais!");
    }

    // Método para ouvir o instrumentos musicais
    public void ouvir() {
        System.out.println("Ouvir os instrumentos musicais!");
    }

    // Método para exibir informações do instrumentos musicais

    public String toString() {
        return "instrumentos musicais [tipo=" + tipo + ", tamanho=" + tamanho + ", material=" + material + "]";
    }

    // Método principal para testar a classe instrumentos musicais
    public static void main(String[] args) {
        // Criando um objeto instrumentos musicais
        InstrumentosMusicais instrumentosMusicais = new InstrumentosMusicais("corda", "medio", "madeira");

        // Exibindo informações do instrumentos musicais
        System.out.println(instrumentosMusicais);

        // Usando os métodos
        instrumentosMusicais.afinar();
        instrumentosMusicais.tocar();
        instrumentosMusicais.ouvir();
    }
}

