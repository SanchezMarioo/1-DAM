/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author mario.sanper.2
 */
public class CuentaCorriente {

    String dni;
    String nombreTitular;
    double dinero;
    /**
     * 
     * @param dni DNI 
     * @param nombreTitular Nombre del titular
     * @param dinero Dinero incial 
     */
    CuentaCorriente(String dni, String nombreTitular, double dinero) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.dinero = 0.0;
    }
    void cambiarTitular(String titular){
        nombreTitular = titular;
    }
    /**
     * Este metodo incrementa el dinero
     *
     * @param dinero se le pasa por parametro el dinero a incrementar
     */
    void ingresarDinero(double dinero) {
        if (dinero < 0){
            System.err.println("No puedes introducir una cantidad negativa");
            return;
        }
        this.dinero += dinero;
        System.out.println("Has ingresado " + dinero);
    }
    /**
     * La funcion permite retirar dinero 
     * @param dinero variable que sacar el dinero 
     */
    // Utilizar boolean es mejor practica
    void retirarDinero(double dinero) {
        if(dinero > this.dinero && dinero > 0){
            System.err.println("No puedes sacar mas dinero del que tienes melon!");
            return;
        }
        this.dinero -= dinero;
        System.out.println("Has retirado " + dinero);
    }
    /**
     * Muestra la informacion al usuario 
     */
    void mostrarInformacion(){
        System.out.println("Titular " + nombreTitular + " con DNI " + dni + " saldo " + dinero + "€.");
    }
}
