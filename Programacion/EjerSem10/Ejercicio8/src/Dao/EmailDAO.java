/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import ConexionBD.ConexionBD;
import java.util.ArrayList;
import java.sql.*;
import java.time.LocalDate;

/**
 *
 * @author Mario
 */
public class EmailDAO {

    public int insert(ArrayList<String> correos) throws SQLException {
        String select = "SELECT COUNT(*) AS cuenta FROM registros WHERE email = ?";
        String insert = "INSERT INTO registros(email,fecha) VALUES (?,?)";
        int setInsert = 0;
        for (String correo : correos) {
            try (Connection connect = ConexionBD.connect(); PreparedStatement statament = connect.prepareStatement(select)) {
                statament.setString(1, correo);
                ResultSet set = statament.executeQuery();
                set.next();
                int cuenta = set.getInt("cuenta");

                if (cuenta == 0) {
                    try (PreparedStatement statementQuery = connect.prepareStatement(insert)) {
                        statementQuery.setString(1, correo);
                        statementQuery.setDate(2, Date.valueOf(LocalDate.now()));
                        setInsert += statementQuery.executeUpdate();

                    }
                }
            }
        }
        return setInsert;
    }

    public int delete(String correo) throws SQLException {
        String queryDelete = "DELETE FROM registros WHERE email = ?";
        try (Connection connect = ConexionBD.connect(); PreparedStatement statament = connect.prepareStatement(queryDelete);) {
            statament.setString(1, correo);
            return statament.executeUpdate();
        }
    }

    public ArrayList<String> selectCorreos() throws SQLException {
        ArrayList<String> correos = new ArrayList<>();
        String query = "SELECT * FROM registros";
        try (Connection connect = ConexionBD.connect(); PreparedStatement statament = connect.prepareStatement(query); ResultSet set = statament.executeQuery()) {
            while (set.next()) {
                String correo = set.getString("email");
                correos.add(correo);
            }
        }
        return correos;
    }
}
