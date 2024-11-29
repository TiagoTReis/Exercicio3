package DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.demo.Casas;
import org.example.demo.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CasasDAO {

    public void inserirCasa(Casas casa) {
        String sql = "INSERT INTO casas (cor, tamanho, formato) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, casa.getCor());
            stmt.setString(2, casa.getTamanho());
            stmt.setString(3, casa.getFormato());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarCasa(Casas casa) {
        String sql = "UPDATE casas SET cor = ?, tamanho = ?, formato = ? WHERE idcasas = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, casa.getCor());
            stmt.setString(2, casa.getTamanho());
            stmt.setString(3, casa.getFormato());
            stmt.setInt(4, casa.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarCasa(int id) {
        String sql = "DELETE FROM casas WHERE idcasas = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Casas> listarCasas() {
        ObservableList<Casas> casasList = FXCollections.observableArrayList();
        String sql = "SELECT idcasas, cor, tamanho, formato FROM casas";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Casas casa = new Casas(
                        rs.getInt("idcasas"),
                        rs.getString("cor"),
                        rs.getString("tamanho"),
                        rs.getString("formato")
                );
                casasList.add(casa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return casasList;
    }
}
