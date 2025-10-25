/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fechas_especiales;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Fechas_Especiales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia, mes, ano, diaSemana;
        boolean anoBisiesto = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el dia: ");
        dia = sc.nextInt();
        System.out.println("Dime el dia semana (1-7): ");
        diaSemana = sc.nextInt();
        System.out.println("Dime el mes: ");
        mes = sc.nextInt();
        System.out.println("Dime el año: ");
        ano = sc.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            anoBisiesto = true;
        }

        int diaMes = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                31;
            case 4, 6, 9, 11 ->
                30;
            case 2 ->
                28;
            default ->
                -1;
        };
        char diaSemanaEleccion = switch (diaSemana) {
            case 1 ->
                'L';
            case 2 ->
                'M';
            case 3 ->
                'X';
            case 4 ->
                'J';
            case 5 ->
                'V';
            case 6 ->
                'S';
            case 7 ->
                'D';
            default ->
                'Z';
        };
        System.out.println(diaSemanaEleccion);
        if (diaSemanaEleccion != 'S' || diaSemanaEleccion != 'D'){
            System.out.println("No es valido ");
        }
        if ((dia <= diaMes || anoBisiesto) && (diaSemanaEleccion != 'S' && diaSemanaEleccion != 'D')) {
            System.out.println("Es valido");
        } else {
            System.out.println("No es valido");
        }
    }

}
