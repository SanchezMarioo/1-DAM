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
        char[][] matrizInterna = new char[12][12];
        int maximo = 5;
        int minimo = 4;
        int numeroRandom2 = 0;
        int numeroRandom = 0;

        for (int i = 0; i < barcos.length; i++) {
            boolean esRep = false;
            boolean esVertical = (int) (Math.random() * 2) == 0 ? true : false;
            if (!esVertical) {
                numeroRandom = (int) (Math.random() * (maximo - minimo) + 1);
                numeroRandom2 = (int) (Math.random() * 8);
            } else {
                numeroRandom2 = (int) (Math.random() * (maximo - minimo) + 1);
                numeroRandom = (int) (Math.random() * 8);
            }

            maximo++;
            minimo--;
            for (int j = barcos[i]; j > 0; j--) {
                int numeroRandomSup = numeroRandom;
                int numeroRandom2Sup = numeroRandom2;

                if (matrizInterna[numeroRandomSup][numeroRandom2Sup] == '#') {
                    System.out.println("Encontro un conflicto " + numeroRandomSup + numeroRandom2Sup);
                    i--;
                    esRep = true;
                    continue;
                }

                if (!esVertical) {
                    numeroRandomSup++;
                } else {
                    numeroRandomSup++;
                }
            }
            if (!esRep) {
                for (int k = barcos[i]; k > 0; k--) {
                    if (!esVertical) {
                        numeroRandom++;
                    } else {
                        numeroRandom2++;
                    }
                    System.out.println(numeroRandom + numeroRandom2);
                    matrizInterna[numeroRandom][numeroRandom2] = '#';
                }
            }
        }
        for (int i = 0; i < matrizInterna.length; i++) {
            for (int j = 0; j < matrizInterna.length; j++) {
                System.out.print(matrizInterna[i][j] + "\t");
            }
            System.out.println("");
        }
    }

}
