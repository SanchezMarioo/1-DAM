/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundirlaflotarefactor;

/**
 *
 * @author Mario
 */
public class HundirLaFlotaRefactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrizUsuario = new int[8][8];
        int[] barcos = {4, 3, 2};
        char[][] matrizInterna = new char[8][8];
        int columna = 0;
        int fila = 0;
        boolean esRep = false;
        final int TAMAÑO = 8;
        final char BARCO = '#';
        final char VACIO = '.';
        for (int i = 0; i < TAMAÑO; i++) {
            for (int j = 0; j < TAMAÑO; j++) {
                matrizInterna[i][j] = VACIO;
            }
        }
        int barcoPosicion = 0;
        while (barcoPosicion < barcos.length) {
            esRep = false;
            boolean esVertical = (int) (Math.random() * 2) == 0 ? true : false;
            columna = (int) (Math.random() * 8);
            fila = (int) (Math.random() * 8);
            int filaTemp = fila;
            int colTemp = columna;

            for (int i = 0; i < barcos[barcoPosicion]; i++) {
                // Límites
                if (filaTemp < 0 || filaTemp >= TAMAÑO || colTemp < 0 || colTemp >= TAMAÑO) {
                    esRep = true;
                    break;
                }
                // Casilla actual
                if (matrizInterna[filaTemp][colTemp] == BARCO) {
                    esRep = true;
                    break;
                }
                // Arriba
                if (filaTemp > 0 && matrizInterna[filaTemp - 1][colTemp] == BARCO) {
                    esRep = true;
                    break;
                }
                // Abajo
                if (filaTemp < TAMAÑO - 1 && matrizInterna[filaTemp + 1][colTemp] == BARCO) {
                    esRep = true;
                    break;
                }
                // Izquierda
                if (colTemp > 0 && matrizInterna[filaTemp][colTemp - 1] == BARCO) {
                    esRep = true;
                    break;
                }
                // Derecha
                if (colTemp < TAMAÑO - 1 && matrizInterna[filaTemp][colTemp + 1] == BARCO) {
                    esRep = true;
                    break;
                }
                if (esVertical) {
                    filaTemp++;
                } else {
                    colTemp++;
                }
            }
            if (!esRep) {
                for (int i = 0; i < barcos[barcoPosicion]; i++) {
                    matrizInterna[fila][columna] = BARCO;
                    if (esVertical) {
                        fila++;
                    } else {
                        columna++;
                    }
                }
                barcoPosicion++;
            }
        }
        for (int i = 0; i < matrizInterna.length; i++) {
            for (int j = 0; j < matrizInterna.length; j++) {
                System.out.print(matrizInterna[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
