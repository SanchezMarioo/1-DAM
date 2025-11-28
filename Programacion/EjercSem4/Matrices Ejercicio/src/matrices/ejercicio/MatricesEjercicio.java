/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices.ejercicio;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class MatricesEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] valores = new int[3][3];
        String coordenadas = "";
        Scanner sc = new Scanner(System.in);
        int fila = 0;
        int columna = 0;
        int cTransformada = 0;
        int valoresAumentar = 0;
        boolean formatoIncorrecto = false;
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                valores[i][j] = 1;
            }
        }
        do {
            valoresAumentar = 0;
            System.out.print("Dime las coordenadas con el siguente formato (X,Y): ");
            coordenadas = sc.next();
            formatoIncorrecto = false;
            if (coordenadas.equals("FIN")) {
                continue;
            }
            if (coordenadas.length() == 3 || !formatoIncorrecto) {
                for (int i = 0; i < coordenadas.length(); i++) {
                    int c = coordenadas.charAt(i);
                    if (i == 1) {
                        if (c != ',') {
                            formatoIncorrecto = true;
                            break;
                        }
                        continue;
                    }
                    if (c < 48 || c > 50) {
                        formatoIncorrecto = true;
                        continue;
                    } else {
                        switch (c) {
                            case 48:
                                cTransformada = 0;
                                break;
                            case 49:
                                cTransformada = 1;
                                break;
                            case 50:
                                cTransformada = 2;
                                break;
                        }
                        if (i == 0) {
                            fila = cTransformada;
                        } else if (i == 2) {
                            columna = cTransformada;
                        }

                    }
                }
                if (!formatoIncorrecto) {
                    valoresAumentar = valores[fila][columna]++;
                    valoresAumentar++;
                    valores[fila][columna] = valoresAumentar;
                    for (int i = 0; i < valores.length; i++) {
                        for (int j = 0; j < valores.length; j++) {
                            System.out.print(valores[i][j] + "\t");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Has introducido el formato incorrecto");
                }

            }
        } while (!coordenadas.equals("FIN"));
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                System.out.print(valores[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
