/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author MARIO
 */
public class Viaje {

    private double importeTotal;
    private int numeroPersonas;

    public Viaje(double importeTotal, int numeroPersonas) {
        this.importeTotal = importeTotal;
        this.numeroPersonas = numeroPersonas;
    }

    public void calcularImportePersona() {

        try {
            double importe = importeTotal / numeroPersonas;
            if (Double.isInfinite(importe)) {
                throw new ArithmeticException(" / by zero");
            }
            System.out.println("El importe por persona es " + importe);
        } catch (ArithmeticException e) {
            System.out.println("El viaje no puede ir con 0 personas ");
            System.err.println(e.getMessage());
        }
    }
}
