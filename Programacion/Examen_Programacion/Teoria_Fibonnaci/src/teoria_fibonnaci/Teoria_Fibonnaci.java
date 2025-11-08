/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoria_fibonnaci;

/**
 *
 * @author MARIO
 */
public class Teoria_Fibonnaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroSecuencia = 1, num1 = 1, num2 = 0, numeroSumar = 1, numeroSumarAnterior = 0;
        for (int i = 1; i <= 50; i++) {
            num1 = numeroSumar;

            System.out.println(numeroSumar);
            numeroSumar = num1 + num2;
            num2 = num1;
        }
    }
}
