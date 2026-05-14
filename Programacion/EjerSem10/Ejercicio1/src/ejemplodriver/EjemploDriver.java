/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplodriver;

/**
 *
 * @author mario.sanper.2
 */
public class EjemploDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConexionBD bd = new ConexionBD();
        VistaConsola vista = new VistaConsola();
        Gestor g = new Gestor(bd, vista);
        g.init();
    }
}
