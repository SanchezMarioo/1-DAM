/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificador_triangulos;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Clasificador_Triangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0, b, c, ladoA = 0, ladoB = 0, ladoC = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la longitud del lado A: ");
        a = sc.nextInt();
        System.out.println("Dime la longitud del lado B: ");
        b = sc.nextInt();
        System.out.println("Dime la longitud del lado C: ");
        c = sc.nextInt();
        if (a >= b && b >= c) {
            ladoA = a;
            ladoB = b;
            ladoC = c;
        } else if (a >= c && a >= b) {
            ladoA = a;
            ladoB = c;
            ladoC = b;
        } else if (b >= a && b >= c) {
            ladoA = b;
            ladoB = c;
            ladoC = a;
        } else if (b >= c && b >= a) {
            ladoA = b;
            ladoB = a;
            ladoC = c;
        } else if (c >= a && c >= b) {
            ladoA = c;
            ladoB = a;
            ladoC = b;
        }
        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Equilatero");
        } else if (ladoA == ladoB && ladoA != ladoC && ladoB != ladoC){
            System.out.println("Isosceles");
        } else{
            System.out.println("Escaleno");
        }
        System.out.println("A " + ladoA + " " + ladoB + " " + ladoC);
    }

}
