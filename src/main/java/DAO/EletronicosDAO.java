package DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.demo.Eletronicos;
import org.example.demo.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EletronicosDAO {

    public void inserirEletronico(Eletronicos eletronico) {
        String sql = "INSERT INTO eletronicos (formato, cor, material) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, eletronico.getFormato());
            stmt.setString(2, eletronico.getCor());
            stmt.setString(3, eletronico.getMaterial());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarEletronico(Eletronicos eletronico) {
        String sql = "UPDATE eletronicos SET formato = ?, cor = ?, material = ? WHERE ideletronicos = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, eletronico.getFormato());
            stmt.setString(2, eletronico.getCor());
            stmt.setString(3, eletronico.getMaterial());
            stmt.setInt(4, eletronico.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarEletronico(int id) {
        String sql = "DELETE FROM eletronicos WHERE ideletronicos = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Eletronicos> listarEletronicos() {
        ObservableList<Eletronicos> eletronicosList = FXCollections.observableArrayList();
        String sql = "SELECT ideletronicos, formato, cor, material FROM eletronicos";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Eletronicos eletronico = new Eletronicos(
                        rs.getInt("ideletronicos"),
                        rs.getString("formato"),
                        rs.getString("cor"),
                        rs.getString("material")
                );
                eletronicosList.add(eletronico);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return eletronicosList;
    }
}
