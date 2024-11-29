package org.example.demo;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Carros {
    private final SimpleIntegerProperty id;
    private final SimpleStringProperty cor;
    private final SimpleStringProperty marca;
    private final SimpleStringProperty tipo;

    public Carros(int id, String cor, String marca, String tipo) {
        this.id = new SimpleIntegerProperty(id);
        this.cor = new SimpleStringProperty(cor);
        this.marca = new SimpleStringProperty(marca);
        this.tipo = new SimpleStringProperty(tipo);
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getCor() {
        return cor.get();
    }

    public void setCor(String cor) {
        this.cor.set(cor);
    }

    public String getMarca() {
        return marca.get();
    }

    public void setMarca(String marca) {
        this.marca.set(marca);
    }

    public String getTipo() {
        return tipo.get();
    }

    public void setTipo(String tipo) {
        this.tipo.set(tipo);
    }

    public void acelerar() {
        System.out.println("Acelere o carro");
    }

    public void frear() {
        System.out.println("Hora de frear o carro");
    }
}
