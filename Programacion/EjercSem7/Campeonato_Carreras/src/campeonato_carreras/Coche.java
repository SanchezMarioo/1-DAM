package campeonato_carreras;

public class Coche {
    private String matricula;
    private String modelo;
    private double velocidadBase;
    private double combustible;
    private double consumoBase;
    private double distanciaRecorrida;


    public Coche(String matricula, String modelo, double velocidadBase, double combustible, double consumoBase, double distanciaRecorrida) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidadBase = velocidadBase;
        this.combustible = combustible;
        this.consumoBase = consumoBase;
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadBase() {
        return velocidadBase;
    }

    public double getCombustible() {
        return combustible;
    }

    public double getConsumoBase() {
        return consumoBase;
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }




}
