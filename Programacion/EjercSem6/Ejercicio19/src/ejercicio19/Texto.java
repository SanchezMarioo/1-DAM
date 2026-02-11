/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author mario.sanper.2
 */
public class Texto {

    private int caracteres;
    private String cadena = "";
    private int minusculas;
    private int mayusuculas;
    public Texto(int caracteres) {
        this.caracteres = caracteres;
    }

    public void añadirCaracteresPrincipio(int n, String cadenaAñadir) {
        System.out.println(cadena.length());
        if (n < cadena.length()) {
            String nuevaCadena = "";
            for (int i = 0; i < cadena.length(); i++) {
                if (i < n) {
                    nuevaCadena += " ";
                } else {
                    nuevaCadena += cadena;
                }
            }
            for (int i = 0; i < n; i++) {
                nuevaCadena += cadenaAñadir;
            }
            nuevaCadena = cadena;
        } else {
            System.out.println("No puedes añadir una nueva cadena.");
        }
    }

    public void añadirCaracteresFinal(int n, String cadenaAñadir) {
        if (n < cadena.length()) {
            cadena += cadenaAñadir;
        } else {
            System.out.println("No puedes añadir una nueva cadena.");
        }

    }
    public void contarMayusMinus(){
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if(Character.isLowerCase(c)){
                minusculas++;
            } 
            if(Character.isUpperCase(c)){
                mayusuculas++;
            }
        }
    }
    public void mostrarInformacion(){
        System.out.println("Cadena " + cadena);
    }
}
