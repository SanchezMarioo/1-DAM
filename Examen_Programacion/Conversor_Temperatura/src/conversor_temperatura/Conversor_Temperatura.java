/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversor_temperatura;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Conversor_Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int eleccion;
        float temperatura, resultado = 0;
        System.out.println("Menu Temperaturas");
        System.out.println("1: Convierte de Celsius a Fahrenheit ");
        System.out.println("2: Convierte de Fahrenheit a Celsius");
        System.out.println("3: Convierte de Celsius a Kelvin ");
        System.out.println("Elige una opcion: ");
        eleccion = sc.nextInt();
        System.out.println("Temperatura a convertir: ");
        temperatura = sc.nextInt();
        float temperaturaConvertida;
        temperaturaConvertida = switch (eleccion) {
            case 1 -> {
                resultado = temperatura * 9 / 5 + 32;
                yield resultado;
            }
            case 2 -> {
                resultado = (temperatura - 32) * 5 / 9;
                yield resultado;
            }
            case 3 -> {
                resultado = (float) (temperatura - 273.15);
                yield resultado;
            }
            default -> {
                System.out.println("Opcion no valida");
                yield resultado;
            }
        };
        System.out.printf("La temperatura convertida es: %2f%n", temperaturaConvertida);

    }

}
