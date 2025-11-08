/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fizzbuzz;

/**
 *
 * @author MARIO
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 100; i++) {
            // Cambiar orden del if poniendo el 3 y 5 arriba evita que imprima  sea la logica mayor
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz " + i);
            } else if (i % 5 == 0 && i % 5 != 0) {
                System.out.println("Buzz " + i);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz" + i);
            }
        }
    }

}
