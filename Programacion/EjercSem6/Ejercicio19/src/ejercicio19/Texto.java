/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;
import java.time.LocalDateTime;

/**
 *
 * @author mario.sanper.2
 */
public class Texto {

    private int longitudMaxima;
    private String cadena = "";
    private LocalDateTime fechaCreada;
    private LocalDateTime fechaUltimaModificacion;

    public Texto(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
        this.fechaCreada = LocalDateTime.now();
    }

    public String getCadena() {
        return cadena;
    }

    public int getLongitudMaxima() {
        return longitudMaxima;
    }

    public void setLongitudMaxima(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
    }

    public void añadirCaracteresPrincipio(String cadenaAñadir) {
        if ((cadena.length() + cadenaAñadir.length()) > longitudMaxima) {
            System.out.println("No puedes añadir eso ");
        } else {
            cadena = cadenaAñadir + cadena;
            modificarFecha();

        }
    }

    public void añadirCaracteresFinal(String cadenaAñadir) {
        if ((cadena.length() + cadenaAñadir.length()) > longitudMaxima) {
            System.out.println("No puedes añadir una nueva cadena.");

        } else {
            cadena += cadenaAñadir;
            System.out.println(cadena);
            modificarFecha();
        }
    }
    private void modificarFecha(){
        fechaUltimaModificacion = LocalDateTime.now();
    }

    public void añadirCaracteresPrincipio(char cadenaAñadir) {
        if ((cadena.length() + 1) > longitudMaxima) {
            System.out.println("No puedes añadir eso ");
        } else {
            cadena = cadenaAñadir + cadena;
            modificarFecha();
        }
    }

    public void añadirCaracteresFinal(char cadenaAñadir) {
        if ((cadena.length() + 1) > longitudMaxima) {
            System.out.println("No puedes añadir una nueva cadena.");

        } else {
            cadena += cadenaAñadir;
            System.out.println(cadena);
            modificarFecha();
        }
    }

    public int contarVocales() {
        String cadenaMinusculas = cadena.toLowerCase();
        int vocales = 0;
        for (int i = 0; i < cadenaMinusculas.length(); i++) {
            char c = cadenaMinusculas.charAt(i);
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u':
                    vocales++;
                    break;
            }
        }
        return vocales;
    }

    public void mostrarInformacion() {
        System.out.println("Fecha creacion del objeto: " + fechaCreada);
        System.out.println("Ultima modificacion del objeto: " + fechaUltimaModificacion);
        System.out.println("Cadena: ");
        System.out.println(cadena);
    }
}
