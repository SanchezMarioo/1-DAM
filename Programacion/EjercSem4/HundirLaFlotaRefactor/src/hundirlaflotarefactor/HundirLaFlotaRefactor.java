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
        int barcoPosicion = 0;
        while (barcoPosicion < barcos.length) {
            esRep = false;
            boolean esVertical = (int) (Math.random() * 2) == 0 ? true : false;
            if (!esVertical) {
                fila = (int) (Math.random() * 8);
                columna = (int) (Math.random() * 8);
            } else {
                columna = (int) (Math.random() * 8);
                fila = (int) (Math.random() * 8);
            }
            int numeroRandomSup = fila;
            int numeroRandom2Sup = columna;
            for (int j = barcos[barcoPosicion]; j > 0; j--) {
                esRep = false;
                if (matrizInterna[numeroRandomSup][numeroRandom2Sup] == '#' || numeroRandom2Sup >= 7 || numeroRandomSup >= 7) {
                    esRep = true;
                    break;
                }

                if (!esVertical) {
                    numeroRandom2Sup++;
                } else {
                    numeroRandomSup++;
                }
            }
            if (!esRep) {
                for (int k = barcos[barcoPosicion]; k > 0; k--) {
                    matrizInterna[fila][columna] = '#';
                    if (!esVertical) {
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
