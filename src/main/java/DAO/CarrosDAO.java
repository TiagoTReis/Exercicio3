package DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.demo.Carros;
import org.example.demo.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarrosDAO {

    public void inserirCarro(Carros carro) {
        String sql = "INSERT INTO carros (cor, marca, tipo) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, carro.getCor());
            stmt.setString(2, carro.getMarca());
            stmt.setString(3, carro.getTipo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarCarro(Carros carro) {
        String sql = "UPDATE carros SET cor = ?, marca = ?, tipo = ? WHERE idcarros = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, carro.getCor());
            stmt.setString(2, carro.getMarca());
            stmt.setString(3, carro.getTipo());
            stmt.setInt(4, carro.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarCarro(int id) {
        String sql = "DELETE FROM carros WHERE idcarros = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Carros> listarCarros() {
        ObservableList<Carros> carrosList = FXCollections.observableArrayList();
        String sql = "SELECT idcarros, cor, marca, tipo FROM carros";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Carros carro = new Carros(
                        rs.getInt("idcarros"),
                        rs.getString("cor"),
                        rs.getString("marca"),
                        rs.getString("tipo")
                );
                carrosList.add(carro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return carrosList;
    }
}
