/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las medidas para verificar si es un triangulo");
        System.out.println("");
        System.out.println("Introduce lado 1: ");
        int a = sc.nextInt();
        System.out.println("Introduce lado 2: ");
        int b = sc.nextInt();
        System.out.println("Introduce lado 3: ");
        int c = sc.nextInt();

        if (a > b && b > c) {
            System.out.println(a + " > " + b + " > " + c);
        } else if (a > c && c > b) {
            System.out.println(a + " > " + c + " > " + b);
        } else if (b > a && a > c) {
            System.out.println(b + " > " + a + " > " + c);
        } else if (b > c && c > a) {
            System.out.println(b + " > " + c + " > " + a);
        } else if (c > a && a > b) {
            System.out.println(c + " > " + a + " > " + b);
        } else if (c > b && b > a) {
            System.out.println(c + " > " + b + " > " + a);
        }

        boolean test = (a + b) > c && a + c > b && c + b > a;
        if (test) {
            System.out.println("Es un triangulo");
            if (a == b && b == c) {
                System.out.println("Equilatero");
            } else if (a == b && c != b || a == c && b != c || b == c && c != a) {
                System.out.println("Isosceles");
            } else if (a != b && c != a && c != b) {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("No es un triangulo");
        }

    }
}
