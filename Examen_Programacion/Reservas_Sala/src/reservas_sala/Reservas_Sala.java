/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservas_sala;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Reservas_Sala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int hora, minuto, duracion, duracionSumar = 0, horaFinal = 0, minutosFinal = 0, duracionRecargo = 0, duracionBloque = 0;
        int porcentaje = 0;
        System.out.println("Dime la hora: ");
        hora = sc.nextInt();
        System.out.println("Dime los minutos: ");
        minuto = sc.nextInt();
        System.out.println("Dime los duracion: ");
        duracion = sc.nextInt();
        if (hora < 0 || hora > 23) {
            System.out.println("Te pasas hora");
        } else if (minuto < 0 || minuto > 59) {
            System.out.println("Te pasas de minutos");
        } else if (duracion % 30 != 0) {
            System.out.println("No es multiplo de 30 minutos");
        } else if (duracion >= 720) {
            System.out.println("Datos invalidos");
        } else {
            horaFinal = duracion / 60;
            minutosFinal = duracion % 60;
            horaFinal += hora;
            minutosFinal += minuto;
            duracion /= 30;
            duracionBloque = duracion * 12;
            if (hora <= 0 || hora < 9) {
                porcentaje = 20;
                duracionRecargo = (int) (duracionBloque * 1.20);
                System.out.println("Recargo");
            } else if (horaFinal >= 18 && horaFinal < 24) {
                porcentaje = 15;
                System.out.println("Recarogo 15");
                 duracionRecargo = (int) (duracionBloque * 1.15);
            }
            if (hora < 9 && horaFinal >= 18) {
                porcentaje = 40;
                System.out.println("Recargo 45");
                duracionRecargo = (int) (duracionBloque * 1.40);
            }
            if (duracionRecargo > 150) {
                duracionRecargo = 150;
            }
            System.out.println(hora + ":" + minuto);
            System.out.println(horaFinal + ":" + minutosFinal);
            System.out.println("Bloques: " + duracion);
            System.out.println("Duracion bloque: " + duracionBloque);
            System.out.println("Porcentaje " + porcentaje);
            System.out.println("Precio final" + duracionRecargo);

        }

    }

}
