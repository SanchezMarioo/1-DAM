/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaCorriente cuentacorriente = new CuentaCorriente("71070399P", "Mario", 300);
        cuentacorriente.ingresarDinero(1000);
        cuentacorriente.retirarDinero(350);
        cuentacorriente.mostrarInformacion();
        cuentacorriente.retirarDinero(700);

    }

}
