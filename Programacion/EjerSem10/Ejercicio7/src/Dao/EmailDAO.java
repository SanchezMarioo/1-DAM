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
        String string = "INSERT INTO registros(email,fecha) VALUES (?,?)";
        for (String correo : correos) {
            try (Connection connection = ConexionBD.connect(); PreparedStatement stament = connection.prepareStatement(string)) {
                stament.setString(1, correo);
                stament.setDate(2, Date.valueOf(LocalDate.now()));
                stament.executeUpdate();
            }
        }

    }
}
