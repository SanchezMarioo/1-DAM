/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author mario.sanper.2
 */
public class Acceso {

    private String usuario;
    private String contraseña;
    private LocalDateTime fecha;
    private boolean esValido;
    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Acceso(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.fecha = LocalDateTime.now();
        this.esValido = true;
    }

    public boolean registrarIntentoAcceso() {
        String contraseñaVuelta = "";
        for (int i = usuario.length(); i > 0; i--) {
            contraseñaVuelta += contraseña.charAt(i);
        }
        if (usuario.equals(contraseñaVuelta)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Usuario: " + usuario + "\n" + "Fecha: " + fecha.format(FORMATO) + "\n " + "Acceso: " + (esValido ? "VALIDO" : "NO VALIDO");
    }

    public String toFile() {
        return usuario + ";" + fecha.format(FORMATO) + ";" + (esValido ? "VALIDO" : "NO VALIDO");
    }

}
