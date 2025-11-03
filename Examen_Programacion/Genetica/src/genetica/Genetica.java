/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genetica;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Genetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, numero;
        boolean esFormatoValido = false, esTipoX = false, esTipoY = false, esPuro = false, esPalindromo = false;
        System.out.println("Dime un numero: ");
        numero = sc.nextInt();
        if (numero >= 100000 && numero <= 999999) {
            n1 = numero / 100000;
            n2 = numero / 10000 % 10;
            n3 = numero / 1000 % 10;
            n4 = numero / 100 % 10;
            n5 = numero / 10 % 10;
            n6 = numero % 10;
            int sumaTipoY = n5 + n2;
            if (n1 == 4 && n6 == 4) {
                esFormatoValido = true;
                if (n4 + n3 > 10) {
                    esTipoX = true;
                }
                if (sumaTipoY % 2 == 0) {
                    esTipoY = true;
                }
                if (n5 != n4 && n5 != n3 && n5 != n2 && n4 != n3 && n4 != n2 && n3 != n2){
                    esPuro = true;
                }
                if (n2 == n5 && n4 == n3){
                    esPalindromo = true;
                }
            }
            if (!esFormatoValido){
                System.out.println("Formato Invalido");
            } else if (esFormatoValido && esPalindromo && (esTipoX || esTipoY)){
                System.out.println("Genoma Maestro");
            } else if( esFormatoValido && esPuro &&(esTipoX && esTipoY)){
                System.out.println("Genoma Puro ");
            } else if (esTipoX || esTipoY){
                System.out.println("Genoma Simple");
            } else {
                System.out.println("Genoma Base No clasificado");
            }
        }
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);

    }

}
