
package org.example.demo;

import DAO.BrinquedoDAO;
import DAO.CachorrosDAO;
import DAO.CasasDAO;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import DAO.CarrosDAO;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HelloController {

    @FXML
    private Label mensagemLabel;

    @FXML
    private TextField tamanhoField;

    @FXML
    private TextField corField;

    @FXML
    private TextField materialField;

    @FXML
    private TableView<Brinquedo> brinquedoTableView;

    @FXML
    private TableColumn<Brinquedo, String> tamanhoColumn;

    @FXML
    private TableColumn<Brinquedo, String> corColumn;

    @FXML
    private TableColumn<Brinquedo, String> materialColumn;

    @FXML
    private TextField racaField;

    @FXML
    private TextField pesoField;

    @FXML
    private TextField idadeField;

    @FXML
    private TableView<Cachorros> cachorroTableView;

    @FXML
    private TableColumn<Cachorros, String> racaColumn;

    @FXML
    private TableColumn<Cachorros, String> pesoColumn;

    @FXML
    private TableColumn<Cachorros, String> idadeColumn;

    @FXML
    private TextField cor1Field;

    @FXML
    private TextField marca1Field;

    @FXML
    private TextField tipo1Field;

    @FXML
    private TableView<Carros> carroTableView;

    @FXML
    private TableColumn<Carros, String> cor1Column;

    @FXML
    private TableColumn<Carros, String> marca1Column;

    @FXML
    private TableColumn<Carros, String> tipo1Column;

    @FXML
    private TableView<Casas> casaTableView;

    @FXML
    private TableColumn<Casas, String> cor2Column;
    @FXML
    private TableColumn<Casas, String> tamanho2Column;
    @FXML
    private TableColumn<Casas, String> formato2Column;

    @FXML
    private TextField cor2Field;
    @FXML
    private TextField tamanho2Field;
    @FXML
    private TextField formato2Field;




    private final BrinquedoDAO brinquedoDAO = new BrinquedoDAO();
    private final CachorrosDAO cachorrosDAO = new CachorrosDAO();
    private final CarrosDAO carrosDAO = new CarrosDAO();
    private CasasDAO casasDAO = new CasasDAO();

    @FXML
    public void initialize() {
        initializeCachorro();
        initializeCarro();
        initializeCasas();

        if (brinquedoTableView != null) {
            tamanhoColumn.setCellValueFactory(new PropertyValueFactory<>("tamanho"));
            corColumn.setCellValueFactory(new PropertyValueFactory<>("cor"));
            materialColumn.setCellValueFactory(new PropertyValueFactory<>("material"));

            carregarBrinquedos();
        }
    }

    @FXML
    public void onCriarButtonClick() {
        String tamanho = tamanhoField.getText();
        String cor = corField.getText();
        String material = materialField.getText();

        if (tamanho.isEmpty() || cor.isEmpty() || material.isEmpty()) {
            mensagemLabel.setText("Todos os campos devem ser preenchidos!");
            return;
        }

        Brinquedo novoBrinquedo = new Brinquedo(tamanho, cor, material);
        brinquedoDAO.inserirBrinquedo(novoBrinquedo);

        // Atualizar a tabela
        carregarBrinquedos();

        // Limpar os campos
        tamanhoField.clear();
        corField.clear();
        materialField.clear();
    }

    @FXML
    public void onDeletarButtonClick() {
        Brinquedo selecionado = brinquedoTableView.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            brinquedoDAO.deletarBrinquedo(selecionado.getTamanho());
            carregarBrinquedos();
        } else {
            mensagemLabel.setText("Selecione um brinquedo para deletar.");
        }
    }

    private void carregarBrinquedos() {
        ObservableList<Brinquedo> brinquedos = brinquedoDAO.listarBrinquedos();
        brinquedoTableView.setItems(brinquedos);
    }

    // Resto do seu código permanece o mesmo
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
        Brinquedo meuBrinquedo = new Brinquedo("pequeno", "amarelo", "plástico");
        meuBrinquedo.brincar();
    }

    public void onGuardarButtonClick() {
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

        @FXML
    public void initializeCachorro() {
        if (cachorroTableView != null) {
            racaColumn.setCellValueFactory(new PropertyValueFactory<>("raca"));
            pesoColumn.setCellValueFactory(new PropertyValueFactory<>("peso"));
            idadeColumn.setCellValueFactory(new PropertyValueFactory<>("idade"));

            carregarCachorros();
        }
    }
    @FXML
    public void onCriarCachorroButtonClick() {
        String raca = racaField.getText();
        String peso = pesoField.getText();
        String idade = idadeField.getText();

        if (raca.isEmpty() || peso.isEmpty() || idade.isEmpty()) {
            mensagemLabel.setText("Todos os campos devem ser preenchidos!");
            return;
        }

        Cachorros novoCachorro = new Cachorros(raca, peso, idade);
        cachorrosDAO.inserirCachorro(novoCachorro);

        carregarCachorros();

        // Limpar campos
        racaField.clear();
        pesoField.clear();
        idadeField.clear();
    }

    @FXML
    public void onDeletarCachorroButtonClick() {
        Cachorros selecionado = cachorroTableView.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            cachorrosDAO.deletarCachorro(selecionado.getId());
            carregarCachorros();
        } else {
            mensagemLabel.setText("Selecione um cachorro para deletar.");
        }
    }

    @FXML
    public void onEditarCachorroButtonClick() {
        Cachorros selecionado = cachorroTableView.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            String novaRaca = racaField.getText();
            String novoPeso = pesoField.getText();
            String novaIdade = idadeField.getText();

            if (novaRaca.isEmpty() || novoPeso.isEmpty() || novaIdade.isEmpty()) {
                mensagemLabel.setText("Preencha todos os campos para atualizar.");
                return;
            }

            selecionado.setRaca(novaRaca);
            selecionado.setPeso(novoPeso);
            selecionado.setIdade(novaIdade);

            cachorrosDAO.atualizarCachorro(selecionado);
            carregarCachorros();

            racaField.clear();
            pesoField.clear();
            idadeField.clear();
        } else {
            mensagemLabel.setText("Selecione um cachorro para editar.");
        }
    }

    private void carregarCachorros() {ObservableList<Cachorros> cachorros = cachorrosDAO.listarCachorros();
        cachorroTableView.setItems(cachorros);
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

    public void initializeCarro() {
        if (carroTableView != null) {
            cor1Column.setCellValueFactory(new PropertyValueFactory<>("cor"));
            marca1Column.setCellValueFactory(new PropertyValueFactory<>("marca"));
            tipo1Column.setCellValueFactory(new PropertyValueFactory<>("tipo"));

            carregarCarros();
        }
    }

    private void carregarCarros() {
        ObservableList<Carros> carros = carrosDAO.listarCarros();
        carroTableView.setItems(carros);
    }

    public void onAcelerarButtonClick() {
        Carros carros = new Carros(0,"Azul", "Porsche", "Esportivo");
        carros.acelerar();
    }

    public void onFrearButtonClick() {
        Carros carros = new Carros(0,"Azul", "Porsche", "Esportivo");
        carros.frear();
    }

    public void onCriarCarroButtonClick() {
        String cor = cor1Field.getText();
        String marca = marca1Field.getText();
        String tipo = tipo1Field.getText();

        if (cor.isEmpty() || marca.isEmpty() || tipo.isEmpty()) {
            mensagemLabel.setText("Todos os campos devem ser preenchidos!");
            return;
        }

        Carros novoCarro = new Carros(0,cor, marca, tipo);
        carrosDAO.inserirCarro(novoCarro);

        carregarCarros();

        cor1Field.clear();
        marca1Field.clear();
        tipo1Field.clear();
    }

    @FXML
    public void onApagarCarroButtonClick() {
        Carros selecionado = carroTableView.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            carrosDAO.deletarCarro(selecionado.getId());
            carregarCarros();
        } else {
            mensagemLabel.setText("Selecione um carro para deletar.");
        }
    }

    @FXML
    public void onEditarCarroButtonClick() {
        // Aqui você precisará identificar o carro a ser editado,
        // e atualizar os dados no banco.
        System.out.println("Implementar lógica para editar carro.");
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

    // Método de inicialização
    @FXML
    public void initializeCasas() {
        // Inicializa a TableView e carrega os dados das casas
        if (casaTableView != null) {
            cor2Column.setCellValueFactory(new PropertyValueFactory<>("cor"));
            tamanho2Column.setCellValueFactory(new PropertyValueFactory<>("tamanho"));
            formato2Column.setCellValueFactory(new PropertyValueFactory<>("formato"));
            carregarCasas();
        }
    }

    private void carregarCasas() {
        ObservableList<Casas> casas = casasDAO.listarCasas();
        casaTableView.setItems(casas);
    }

    // Método para adicionar uma nova casa
    @FXML
    private void onCriarCasaButtonClick() {
        String cor = cor2Field.getText();
        String tamanho = tamanho2Field.getText();
        String formato = formato2Field.getText();

        if (cor.isEmpty() || tamanho.isEmpty() || formato.isEmpty()) {
            mensagemLabel.setText("Todos os campos devem ser preenchidos!");
            return;
        }

        Casas novaCasa = new Casas(cor, tamanho, formato);
        casasDAO.inserirCasa(novaCasa);
        carregarCasas();

        cor2Field.clear();
        tamanho2Field.clear();
        formato2Field.clear();
    }

    @FXML
    private void onEditarCasaButtonClick() {
        Casas casaSelecionada = casaTableView.getSelectionModel().getSelectedItem();
        if (casaSelecionada != null) {
            casaSelecionada.setCor(cor2Column.getText());
            casaSelecionada.setTamanho(tamanho2Column.getText());
            casaSelecionada.setFormato(formato2Column.getText());

            casasDAO.atualizarCasa(casaSelecionada);
            carregarCasas();


            cor2Field.clear();
            tamanho2Field.clear();
            formato2Field.clear();
        } else {
            mensagemLabel.setText("Selecione uma casa para editar.");
        }
    }

    // Método para excluir uma casa
    @FXML
    private void onDeletarCasaButtonClick() {
        Casas casaSelecionada = casaTableView.getSelectionModel().getSelectedItem();
        if (casaSelecionada != null) {
            casasDAO.deletarCasa(casaSelecionada.getId());
            carregarCasas(); // Atualiza a tabela
        } else {
            mensagemLabel.setText("Selecione uma casa para deletar.");
        }
    }


    public void onConstuirButtonClick() {
        //mensagemLabel.setText("Hora de construir a casa");
        Casas casas = new Casas("Amarela", "Grande", "Retangular");
        casas.construir();
    }

    public void onPintarButtonClick() {
        // mensagemLabel.setText("Hora de pintar a casa");
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
        //mensagemLabel.setText("Hora de guardar os eletronicos");
        Eletronicos eletronicos = new Eletronicos("Retangular", "Cinza", "Plastico");
        eletronicos.guardar();
    }

    public void onLigarButtonClick() {
        //mensagemLabel.setText("Hora de ligar os eletronicos");
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
        // mensagemLabel.setText("Hora de comer a fruta");
        Frutas frutas = new Frutas("doce", "amarela", "macio");
        frutas.comer();
    }

    public void onLavarButtonClick() {
        // mensagemLabel.setText("Hora de lavar a fruta");
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
        //mensagemLabel.setText("O gatinho está arranhando");
        Gatos gatoss = new Gatos("persa", "cinza", "pequeno");
        gatoss.arranhar();
    }

    public void onMiarButtonClick(ActionEvent actionEvent) {
        //mensagemLabel.setText("O gatinho está miando");
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
        //mensagemLabel.setText("Bora afinar os instrumentos");
        InstrumentosMusicais instrumentosMusicais = new InstrumentosMusicais("corda", "medio", "madeira");
        instrumentosMusicais.afinar();
    }

    public void onTocarButtonClick() {
        //mensagemLabel.setText("Bora tocar os instrumentos");
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
        //mensagemLabel.setText("Pikachu raio de trovão");
        Pokemon pokemon = new Pokemon("amarelo", "eletrico", "6kg");
        pokemon.lutar();
    }

    public void onDefenderButtonClick() {
        // mensagemLabel.setText("Corre Pikachu!!!");
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
        // mensagemLabel.setText("Bora jogar time!");
        Times times = new Times("Rio de Janeiro", "Vermelho", "Maracana");
        times.jogar();
    }

    public void onGanharButtonClick() {
        //mensagemLabel.setText("Bora ganhar time!");
        Times times = new Times("Rio de Janeiro", "Vermelho", "Maracana");
        times.ganhar();
    }


    public CarrosDAO getCarrosDAO() {
        return carrosDAO;
    }
}

