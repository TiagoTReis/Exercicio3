package org.example.demo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Brinquedo {

    private final StringProperty tamanho;
    private final StringProperty cor;
    private final StringProperty material;

    public Brinquedo(String tamanho, String cor, String material) {
        this.tamanho = new SimpleStringProperty(tamanho);
        this.cor = new SimpleStringProperty(cor);
        this.material = new SimpleStringProperty(material);
    }

    public String getTamanho() {
        return tamanho.get();
    }

    public void setTamanho(String tamanho) {
        this.tamanho.set(tamanho);
    }

    public StringProperty tamanhoProperty() {
        return tamanho;
    }

    public String getCor() {
        return cor.get();
    }

    public void setCor(String cor) {
        this.cor.set(cor);
    }

    public StringProperty corProperty() {
        return cor;
    }

    public String getMaterial() {
        return material.get();
    }

    public void setMaterial(String material) {
        this.material.set(material);
    }

    public StringProperty materialProperty() {
        return material;
    }

    public void brincar() {
    }

    public void guardar() {
    }
}
