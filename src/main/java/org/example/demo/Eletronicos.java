package org.example.demo;

public class Eletronicos {

    // Atributos
    private String formato;
    private String cor;
    private String material;

    // Construtor
    public Eletronicos(String formato, String cor, String material) {
        this.formato = formato;
        this.cor = cor;
        this.material = material;
    }

    // Métodos getters e setters
    public String getformato() {
        return formato;
    }

    public void setformato(String formato) {
        this.formato = formato;
    }

    public String getcor() {
        return cor;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public String getmaterial() {
        return material;
    }

    public void setmaterial(String material) {
        this.material = material;
    }

    // Método para usar o eletronico
    public void usar() {
        System.out.println("Usar o eletronico!");
    }

    // Método para guardar a eletronico
    public void guardar() {
        System.out.println("Guardar o eletronico");
    }

    // Método para ligar a eletronico
    public void ligar() {
        System.out.println("Ligar o eletronico");
    }

    // Método para exibir informações do eletronicos
    @Override
    public String toString() {
        return "eletronicos [formato=" + formato + ", cor=" + cor + ", material=" + material + "]";
    }

    // Método principal para testar a classe eletronicos
    public static void main(String[] args) {
        // Criando um objeto eletronicos
        Eletronicos eletronicos = new Eletronicos("Retangular", "Cinza", "Plastico");

        // Exibindo informações do eletronicos
        System.out.println(eletronicos);

        // Usando os métodos
        eletronicos.guardar();
        eletronicos.usar();
        eletronicos.ligar();
    }
}


