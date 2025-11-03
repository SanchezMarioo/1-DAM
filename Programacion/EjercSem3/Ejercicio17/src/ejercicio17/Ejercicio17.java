import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeroUsuario = 0;
        int potenciaDiez = 0;
        int contadorPotencias = 0;
        int numeroTemporal = 0;
        int cantidadDigitos = 0;
        int digitoActual = 0;
        int base = 10;
        System.out.print("Dime un número: ");
        numeroUsuario = sc.nextInt();
        numeroTemporal = numeroUsuario;
        // Contar la cantidad de dígitos
        do {
            numeroTemporal /= 10;
            cantidadDigitos++;
        } while (numeroTemporal != 0);

        // Descomponer y mostrar los dígitos del número
        do {
            contadorPotencias++;
            potenciaDiez = (int) Math.pow(base, contadorPotencias);
            potenciaDiez /= 10;
            digitoActual = numeroUsuario / potenciaDiez % 10;
            System.out.println(digitoActual);
        } while (contadorPotencias != cantidadDigitos);
    }
}
