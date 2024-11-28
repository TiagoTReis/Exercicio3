package DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.demo.Cachorros;
import org.example.demo.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CachorrosDAO {

    public void inserirCachorro(Cachorros cachorro) {
        String sql = "INSERT INTO cachorros (raca, peso, idade) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cachorro.getRaca());
            stmt.setString(2, cachorro.getPeso());
            stmt.setString(3, cachorro.getIdade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarCachorro(Cachorros cachorro) {
        String sql = "UPDATE cachorros SET raca = ?, peso = ?, idade = ? WHERE idcachorros = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cachorro.getRaca());
            stmt.setString(2, cachorro.getPeso());
            stmt.setString(3, cachorro.getIdade());
            stmt.setInt(4, cachorro.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarCachorro(int id) {
        String sql = "DELETE FROM cachorros WHERE idcachorros = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Cachorros> listarCachorros() {
        ObservableList<Cachorros> cachorrosList = FXCollections.observableArrayList();
        String sql = "SELECT idcachorros, raca, peso, idade FROM cachorros";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Cachorros cachorro = new Cachorros(
                        rs.getInt("idcachorros"),
                        rs.getString("raca"),
                        rs.getString("peso"),
                        rs.getString("idade")
                );
                cachorrosList.add(cachorro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cachorrosList;
    }
}
