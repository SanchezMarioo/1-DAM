/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentes_fusion;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Componentes_Fusion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double energiaBase, resonancia, temperatura, potencialPlasma = 0, factorDegradacion = 0, indiceContencion = 0;
        int codMaterial;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la energia base: ");
        energiaBase = sc.nextDouble();
        System.out.println("Cual es el multiplicador de resonancia: ");
        resonancia = sc.nextDouble();
        System.out.println("Dime la temperatura en Kelvin (K): ");
        temperatura = sc.nextDouble();
        System.out.println("1.Volframio");
        System.out.println("2.Berilio");
        System.out.println("3.Compuesto de Carbono");
        System.out.println("Dime el codigo del material: ");
        codMaterial = sc.nextInt();
        System.out.println("1. Calcular Potencial de Plasma (PP)");
        System.out.println("2. Calcular Factor de Degradación Térmica (FDT)");
        System.out.println("3. Calcular Índice de Contención (IC)");
        System.out.println("4. Generar Reporte de Viabilidad Completo");
        int eleccion = sc.nextInt();
        switch (eleccion) {
            case 1:
                if (resonancia < 1) {
                    potencialPlasma = energiaBase * Math.sqrt(potencialPlasma);
                } else if (resonancia == 1) {
                    potencialPlasma = energiaBase * 100;
                } else if (resonancia < 1 && potencialPlasma <= 3) {
                    potencialPlasma = energiaBase * Math.pow(resonancia, 2);
                } else {
                    potencialPlasma = (energiaBase * resonancia) - resonancia;
                }
                break;
            case 2:
                switch (codMaterial) {
                    case 1:
                        if (temperatura < 1500) {
                            factorDegradacion = temperatura * 0.01;
                        } else if (temperatura <= 1500 && temperatura < 3000) {
                            factorDegradacion = 15 + (temperatura - 1500) * 0.05;
                        } else {
                            factorDegradacion = 90 + Math.log10(temperatura) * 10;
                        }
                        break;
                    case 2:
                        if (temperatura <= 1000) {
                            factorDegradacion = 25.0;
                        } else {
                            factorDegradacion = 999.0;
                        }
                        break;
                    case 3:
                        factorDegradacion = (temperatura - 2200.0) / 100;
                        factorDegradacion = Math.abs(factorDegradacion);
                        break;
                    default:
                        factorDegradacion = 0;

                }
                break;
            case 3:
                if (resonancia < 1) {
                    potencialPlasma = energiaBase * Math.sqrt(potencialPlasma);
                } else if (resonancia == 1) {
                    potencialPlasma = energiaBase * 100;
                } else if (resonancia < 1 && potencialPlasma <= 3) {
                    potencialPlasma = energiaBase * Math.pow(resonancia, 2);
                } else {
                    potencialPlasma = (energiaBase * resonancia) - resonancia;
                }

                switch (codMaterial) {
                    case 1:
                        if (temperatura < 1500) {
                            factorDegradacion = temperatura * 0.01;
                        } else if (temperatura <= 1500 && temperatura < 3000) {
                            factorDegradacion = 15 + (temperatura - 1500) * 0.05;
                        } else {
                            factorDegradacion = 90 + Math.log10(temperatura) * 10;
                        }
                        break;
                    case 2:
                        if (temperatura <= 1000) {
                            factorDegradacion = 25.0;
                        } else {
                            factorDegradacion = 999.0;
                        }
                        break;
                    case 3:
                        factorDegradacion = (temperatura - 2200.0) / 100;
                        factorDegradacion = Math.abs(factorDegradacion);
                        break;
                    default:
                        factorDegradacion = 0;

                }
                indiceContencion = (potencialPlasma / 100) - factorDegradacion;

                break;
            case 4:
                if (resonancia < 1) {
                    potencialPlasma = energiaBase * Math.sqrt(potencialPlasma);
                } else if (resonancia == 1) {
                    potencialPlasma = energiaBase * 100;
                } else if (resonancia < 1 && potencialPlasma <= 3) {
                    potencialPlasma = energiaBase * Math.pow(resonancia, 2);
                } else {
                    potencialPlasma = (energiaBase * resonancia) - resonancia;
                }

                switch (codMaterial) {
                    case 1:
                        if (temperatura < 1500) {
                            factorDegradacion = temperatura * 0.01;
                        } else if (temperatura <= 1500 && temperatura < 3000) {
                            factorDegradacion = 15 + (temperatura - 1500) * 0.05;
                        } else {
                            factorDegradacion = 90 + Math.log10(temperatura) * 10;
                        }
                        break;
                    case 2:
                        if (temperatura <= 1000) {
                            factorDegradacion = 25.0;
                        } else {
                            factorDegradacion = 999.0;
                        }
                        break;
                    case 3:
                        factorDegradacion = (temperatura - 2200.0) / 100;
                        factorDegradacion = Math.abs(factorDegradacion);
                        break;
                    default:
                        factorDegradacion = 0;

                }
                indiceContencion = (potencialPlasma / 100) - factorDegradacion;
                if (factorDegradacion == 999 || indiceContencion == 0 || codMaterial == 1 || codMaterial == 3){
                    System.out.println("Estado: FALLO CRÍTICO");
                } else if(indiceContencion < 0 && indiceContencion < 10 || (resonancia > 3 && potencialPlasma > 0) || (codMaterial  == 1 && temperatura > 3000)){
                    System.out.println("Estado: INESTABLE (ALTO RIESGO)");
                } else if (indiceContencion <= 10 && indiceContencion < 50 || (codMaterial == 3 && temperatura > 3000)){
                    System.out.println("Estado: OPERATIVO (CON PRECAUCIÓN)");
                } else if (indiceContencion >= 50){
                    System.out.println("Estado: ESTABLE (ÓPTIMO)");
                }
        }
    }

}
