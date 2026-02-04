/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author mario.sanper.2
 */
public class Persona {

    String nombre = "Anonimo";
    static String hoy = "Domingo";

    void saludo() {
        System.out.println("Hola " + nombre + " y hoy es el dia de semana de " + hoy);
    }

    static void establecerDia(int diaNum) {
        nombre = switch (diaNum) {
            case 1 ->
                "Lunes";

            case 2 ->
                "Martes";

            case 3 ->
                "Miercoles";

            case 4 ->
                "Jueves";

            case 5 ->
                "Viernes";

            case 6 ->
                "Sabado";

            case 7 ->
                "Domingo";

            default ->
                "Domingo";

        };
    }
}
