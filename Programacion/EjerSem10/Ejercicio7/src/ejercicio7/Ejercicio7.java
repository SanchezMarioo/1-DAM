/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import Controlador.ControladorApp;
import Dao.FicheroDAO;
import Vista.VistaConsola;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        FicheroDAO fichero = new FicheroDAO("ejemplo.txt");
        VistaConsola vista = new VistaConsola();
        ControladorApp app = new ControladorApp(fichero, vista);
        app.verCorreos();
        
    }
    
}
