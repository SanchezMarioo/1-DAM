/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Acceso;
import Modelo.AccesoDAO;
import Vista.VistaAcceso;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mario.sanper.2
 */
public class ControladorPersona {

    private VistaAcceso vista;
    private Acceso acceso;
    private AccesoDAO accesoDAO;

    public ControladorPersona(VistaAcceso vista, AccesoDAO accesoDAO) {
        this.vista = vista;
        this.accesoDAO = accesoDAO;
    }

    public void init() {
        do {
            int opcion = vista.pedirOpcion();
            switch (opcion) {
                case 1 ->
                    comprobarAcceso();
                case 2 ->
                    mostrarRegistros();
                case 3 ->
                    mostrarRegistros("VALIDO");
                case 4 ->
                    mostrarRegistros("NO VALIDO");
                case 5 -> 
                    

            }
        } while (true);
    }

    private void comprobarAcceso() {
        try {
            String usuario = vista.pedirMensaje("Dime el usuario");
            String contraseña = vista.pedirMensaje("Dime la contraseña: ");
            Acceso acceso = new Acceso(usuario, contraseña);
            accesoDAO.escribir(acceso.toString());
        } catch (IOException ex) {
            vista.mostrarMensaje(ex.getMessage());
        }
    }

    private void mostrarRegistros() {
        ArrayList<String> lineas;
        try {
            lineas = accesoDAO.leer();
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (IOException ex) {
            vista.mostrarMensaje(ex.getMessage());
        }

    }

    private void mostrarRegistros(String msg) {
        ArrayList<String> lineas;
        try {
            lineas = accesoDAO.leer();
            for (String linea : lineas) {
                if (linea.contains(msg)) {
                    System.out.println(linea);
                }
            }
        } catch (IOException ex) {
            vista.mostrarMensaje(ex.getMessage());
        }
    }

    private void contarRegistrosNoValidos(String msg) {
        int contador = 0;
        ArrayList<String> lineas;
        try {
            lineas = accesoDAO.leer();
            for (String linea : lineas) {
                if (linea.contains(msg)) {
                    contador++;
                }
            }
        } catch (IOException ex) {
            vista.mostrarMensaje(ex.getMessage());
        }
    }

}
