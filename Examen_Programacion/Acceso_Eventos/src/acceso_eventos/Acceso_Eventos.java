/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acceso_eventos;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Acceso_Eventos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int edad, nivel_patrocinio;
        String elegible;
        char cod_acceso;
        System.out.println("¿Cuantos años tienes? : ");
        edad = sc.nextInt();
        System.out.println("Dime el nivel de patrocinio (1/2/3) : ");
        nivel_patrocinio = sc.nextInt();
        System.out.println("Dime su codigo de acceso: ");
        cod_acceso = sc.next().charAt(0);
        if (edad > 25 && (cod_acceso == 'A' || cod_acceso == 'B')) {
            elegible = "Elegible";
        } else if (edad == 18 || edad == 19 || edad == 20 || edad == 21 && nivel_patrocinio == 3) {
            elegible = "Elegible";
        } else if (cod_acceso == 'X' && edad < 60) {
            elegible = "Elegible";
        } else {
            elegible = "NO elegible";
        }
        double descuento = switch (nivel_patrocinio) {
            case 1 ->
                5.0;
            case 2 ->
                12.0;
            case 3 ->
                20.0;
            default ->
                0;
        };
        double edadDescuento = edad > 50 ? descuento * 0.5 : descuento;
        switch (cod_acceso) {
            case 'A', 'X':
                System.out.printf("%s Bienvenido, Patrocinador Premium %.2f%n", elegible, edadDescuento);
                break;
            case 'B':
                System.out.printf("%s Bienvenido, Invitado Especial. Descuento aplicado: %.2f%n", elegible, edadDescuento);
                break;
            default:
                System.out.printf(" %s Bienvenido, Acceso Generado. Descuento aplicado:  %.2f%n", elegible, edadDescuento);
        }
    }

}
