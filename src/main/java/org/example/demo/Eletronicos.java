package org.example.demo;

public class Eletronicos {
    private int id;
    private String formato;
    private String cor;
    private String material;

    public Eletronicos(int id, String formato, String cor, String material) {
        this.id = id;
        this.formato = formato;
        this.cor = cor;
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Eletronicos [id=" + id + ", formato=" + formato + ", cor=" + cor + ", material=" + material + "]";
    }

    public void guardar() {
        System.out.println("Aparelho guardado");
    }

    public void ligar() {
        System.out.println("Aparelho ligado");
    }
}
