package DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.demo.Brinquedo;
import org.example.demo.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BrinquedoDAO {public void inserirBrinquedo(Brinquedo brinquedo) {
    String sql = "INSERT INTO brinquedos (tamanho, cor, material) VALUES (?, ?, ?)";
    try (Connection connection = DatabaseConnection.getConnection();
         PreparedStatement statement = connection.prepareStatement(sql)) {

        statement.setString(1, brinquedo.getTamanho());
        statement.setString(2, brinquedo.getCor());
        statement.setString(3, brinquedo.getMaterial());
        statement.executeUpdate();

        System.out.println("Brinquedo inserido com sucesso!");
    } catch (SQLException e) {
        System.err.println("Erro ao inserir brinquedo: " + e.getMessage());
    }
}

    public ObservableList<Brinquedo> listarBrinquedos() {
        ObservableList<Brinquedo> brinquedos = FXCollections.observableArrayList();
        String sql = "SELECT * FROM brinquedos";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String tamanho = resultSet.getString("tamanho");
                String cor = resultSet.getString("cor");
                String material = resultSet.getString("material");

                Brinquedo brinquedo = new Brinquedo(tamanho, cor, material);
                brinquedos.add(brinquedo);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar brinquedos: " + e.getMessage());
        }
        return brinquedos;
    }

    public void deletarBrinquedo(String tamanho) {
        String sql = "DELETE FROM brinquedos WHERE tamanho = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, tamanho);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Brinquedo deletado com sucesso!");
            } else {
                System.out.println("Nenhum brinquedo encontrado para deletar.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao deletar brinquedo: " + e.getMessage());
        }
    }
}


