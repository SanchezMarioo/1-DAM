/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Acceso;
import Modelo.AccesoDAO;
import Vista.VistaAcceso;

/**
 *
 * @author mario.sanper.2
 */
public class ControladorPersona {
    private VistaAcceso vista;
    private Acceso acceso;
    private AccesoDAO accesoDAO;

    public ControladorPersona(VistaAcceso vista, Acceso acceso, AccesoDAO accesoDAO) {
        this.vista = vista;
        this.acceso = acceso;
        this.accesoDAO = accesoDAO;
    }
    
    public void init(){
        do {
            int opcion = vista.pedirOpcion();
            switch(opcion){
                case 1 -> acceso.registrarIntentoAcceso();
            }
        } while (true);
    }
}
