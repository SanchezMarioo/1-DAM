/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine().toLowerCase(); // Convertimos todo a minúsculas
        contarCaracteres(frase); // Llamamos a la función que cuenta y muestra
    }

    // Función que cuenta cuántas veces aparece cada carácter
    static void contarCaracteres(String frase) {
        String yaMostrado = ""; // Para no repetir los caracteres

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (!yaMostrado.contains(c + "")) { // Solo contamos si no lo hemos contado antes
                int contador = 0;
                for (int j = 0; j < frase.length(); j++) {
                    if (frase.charAt(j) == c) {
                        contador++;
                    }
                }
                System.out.println(c + ": " + contador);
                yaMostrado += c; // Marcamos este carácter como contado
            }
        }
    }

}
