/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dao.FicheroDAO;
import Vista.VistaConsola;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mario.sanper.2
 */
public class ControladorApp {
    private FicheroDAO fichero;
    private VistaConsola vista;

    public ControladorApp(FicheroDAO fichero, VistaConsola vista) {
        this.fichero = fichero;
        this.vista = vista;
    }

    public void verCorreos(){
        ArrayList <String> correos;
        try {
            correos = fichero.read();
            vista.mostrarCorreos(correos);
        } catch (IOException ex) {
            vista.mostrarMensaje(ex.getMessage());
        }
        
    }
    
}
