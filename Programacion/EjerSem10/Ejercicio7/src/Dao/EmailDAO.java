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
 * @author mario.sanper.2
 */
public class EmailDAO {

    public void insert(ArrayList<String> correos) throws SQLException {
        String check = "SELECT COUNT(*) FROM registros WHERE email = ?";
        String insert = "INSERT INTO registros(email,fecha) VALUES (?,?)";

        for (String correo : correos) {
            try (Connection connection = ConexionBD.connect(); PreparedStatement stmCheck = connection.prepareStatement(check)) {

                stmCheck.setString(1, correo);
                ResultSet rs = stmCheck.executeQuery();
                rs.next();
                int count = rs.getInt(1);

                if (count == 0) {
                    try (PreparedStatement stmInsert = connection.prepareStatement(insert)) {
                        stmInsert.setString(1, correo);
                        stmInsert.setDate(2, Date.valueOf(LocalDate.now()));
                        stmInsert.executeUpdate();
                    }
                }
            }
        }
    }
}
