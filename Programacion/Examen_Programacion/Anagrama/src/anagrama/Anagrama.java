/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anagrama;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Anagrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra, palabraDos;
        boolean esAnagrama = true;
        Scanner sc = new Scanner(System.in);

        palabra = sc.nextLine();
        palabraDos = sc.nextLine();
        String palabraRepetida = "";

        if (palabra.length() != palabraDos.length()) {
            return;
        }

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            // Buscar la letra de la primera palabra en la segunda
            int indiceLetra = palabraDos.indexOf(letra);

            if (indiceLetra == -1) {
                esAnagrama = false;
                break;
            } else {
                palabraDos = palabraDos.substring(0, indiceLetra) + palabraDos.substring(indiceLetra + 1);
                System.out.println(palabraDos);

            }
        }
        if(esAnagrama){
            System.out.println("SI lo es");
        } else {
            System.out.println("NO lo es");
        }

    }

}
