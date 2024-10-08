package org.example.demo;

import javafx.event.ActionEvent;
import javafx.scene.control.Label; // Certifique-se de que esta é a importação correta
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class HelloController {

    @FXML
    private Label mensagemLabel;

    @FXML
    protected void onBrinquedoButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Brinquedo.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Brinquedos");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onBrincarButtonClick() {
        //System.out.println("Hora de Brincar!");
        Brinquedo meuBrinquedo = new Brinquedo("pequeno", "amarelo", "plástico");
        meuBrinquedo.brincar();

    }


    public void onGuardarButtonClick() {
        //System.out.println("Vamos guardar os brinquedos");
        Brinquedo meuBrinquedo = new Brinquedo("pequeno", "amarelo", "plástico");
        meuBrinquedo.guardar();
    }

    @FXML
    protected void onCachorrosButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Cachorros.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Cachorros");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onLatirButtonClick() {
        //System.out.println("O Cachorro está latindo");
        Cachorros cachorros = new Cachorros("Doberman", "40", "4");
        cachorros.latir();
    }

    public void onCorrerButtonClick(ActionEvent actionEvent) {
        //System.out.println("O Cachorro está correndo");
        Cachorros cachorros = new Cachorros("Doberman", "40", "4");
        cachorros.correr();
    }

    @FXML
    protected void onCarrosButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Carros.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Carros");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onAcelerarButtonClick() {
        mensagemLabel.setText("Bora Acelerar");
        Carros carros = new Carros("Azul", "Porsche", "Esportivo");
        carros.acelerar();
    }

    public void onFrearButtonClick() {
        mensagemLabel.setText("Bora Frear o carro");
        Carros carros = new Carros("Azul", "Porsche", "Esportivo");
        carros.frear();

    }

    @FXML
    protected void onCasasButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Casas.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Casas");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onConstuirButtonClick() {
        mensagemLabel.setText("Hora de construir a casa");
        Casas casas = new Casas("Amarela", "Grande", "Retangular");
        casas.construir();
    }

    public void onPintarButtonClick() {
        mensagemLabel.setText("Hora de pintar a casa");
        Casas casas = new Casas("Amarela", "Grande", "Retangular");
        casas.pintar();
    }

    @FXML
    protected void onEletronicosButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Eletronicos.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Eletronicos");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onGuardar2ButtonClick() {
        mensagemLabel.setText("Hora de guardar os eletronicos");
        Eletronicos eletronicos = new Eletronicos("Retangular", "Cinza", "Plastico");
        eletronicos.guardar();
    }

    public void onLigarButtonClick() {
        mensagemLabel.setText("Hora de ligar os eletronicos");
        Eletronicos eletronicos = new Eletronicos("Retangular", "Cinza", "Plastico");
        eletronicos.ligar();
    }

    @FXML
    protected void onFrutasButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Frutas.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Frutas");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onComerButtonClick() {
        mensagemLabel.setText("Hora de comer a fruta");
        Frutas frutas = new Frutas("doce", "amarela", "macio");
        frutas.comer();
    }

    public void onLavarButtonClick() {
        mensagemLabel.setText("Hora de lavar a fruta");
        Frutas frutas = new Frutas("doce", "amarela", "macio");
        frutas.lavar();
    }

    @FXML
    protected void onGatosButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Gatos.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Gatos");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void onArranharButtonClick(ActionEvent actionEvent) {
        mensagemLabel.setText("O gatinho está arranhando");
        Gatos gatoss = new Gatos("persa", "cinza", "pequeno");
        gatoss.arranhar();
    }

    public void onMiarButtonClick(ActionEvent actionEvent) {
        mensagemLabel.setText("O gatinho está miando");
        Gatos gatoss = new Gatos("persa", "cinza", "pequeno");
        gatoss.miar();
    }
    @FXML
    protected void onInstrumentosMusicaisButtonClick(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("InstrumentosMusicais.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Instrumentos Musicais");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void onAfinarButtonClick(ActionEvent actionEvent) {
        mensagemLabel.setText("Bora afinar os instrumentos");
        InstrumentosMusicais instrumentosMusicais = new InstrumentosMusicais("corda", "medio", "madeira");
        instrumentosMusicais.afinar();
    }

    public void onTocarButtonClick() {
        mensagemLabel.setText("Bora tocar os instrumentos");
        InstrumentosMusicais instrumentosMusicais = new InstrumentosMusicais("corda", "medio", "madeira");
        instrumentosMusicais.tocar();
    }
    @FXML
    protected void onPokemonButtonClick(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Pokemon.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Pokemon");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void onLutarButtonClick() {
        System.out.println("Pokebola vai!!!");
        mensagemLabel.setText("Pikachu raio de trovão");
        Pokemon pokemon = new Pokemon("amarelo", "eletrico", "6kg");
        pokemon.lutar();
    }

    public void onDefenderButtonClick() {
        mensagemLabel.setText("Corre Pikachu!!!");
        Pokemon pokemon = new Pokemon("amarelo", "eletrico", "6kg");
        pokemon.defender();
    }

    @FXML
    protected void onTimesButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Times.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Times");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void onJogarButtonClick() {
        mensagemLabel.setText("Bora jogar time!");
        Times times = new Times("Rio de Janeiro", "Vermelho", "Maracana");
        times.jogar();
    }

    public void onGanharButtonClick() {
        mensagemLabel.setText("Bora ganhar time!");
        Times times = new Times("Rio de Janeiro", "Vermelho", "Maracana");
        times.ganhar();
    }
    }





