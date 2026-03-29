package campeonato_carreras;

/**
 * Clase Piloto
 */
public class Piloto {
    private String nombre;
    private int dorsal;
    private Coche coche;
    private int puntosAcumulados;


    public Piloto(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    /**
     * Metodo que asigna un coche a un piloto
     *
     * @param coche
     */
    public void asignarCoche(Coche coche) {
        this.coche = coche;
        System.out.println("El coche con matricula " + coche.getMatricula() + " ha sido asignado correctamente.");
    }

    /**
     *
     * @param puntosAcumulados
     */
    public void sumarPuntos(int puntosAcumulados) {
        if (puntosAcumulados < 0) {
            System.err.println("Los puntos no pueden ser negativos.");
        }
        this.puntosAcumulados += puntosAcumulados;
    }

    public void mostrarInformacion() {
        System.out.println("=== INFO PILOTO ===");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Dorsal: #" + this.dorsal);
        System.out.println("Puntos en el Campeonato: " + this.puntosAcumulados);

        // Verificamos si tiene coche asignado para evitar errores
        if (this.coche != null) {
            // Accedemos a sus atributos mediante getters
            System.out.println("Vehículo asignado: " + coche.getModelo() + " (Matrícula: " + coche.getMatricula() + ")");
            System.out.println("Velocidad Base: " + coche.getVelocidadBase() + " km/h");
        } else {
            System.out.println("Vehículo asignado: NINGUNO (No puede competir)");
        }
        System.out.println("-------------------");

    }


}
