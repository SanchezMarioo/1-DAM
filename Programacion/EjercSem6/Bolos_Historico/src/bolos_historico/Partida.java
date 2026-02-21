/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bolos_historico;

/**
 *
 * @author MARIO
 */
public class Partida {

    private Jugador j1;
    private Jugador j2;
    private Marcador marcadorJ1; // Composición: La partida TIENE un marcador
    private Marcador marcadorJ2;
    private int rondas = 0;
    static private int rondasTotales;
    private int tiradaEnRonda = 1;
    static private int partidasTotales = 0;

    public Partida(Jugador j1, Jugador j2, int rondas) {
        this.j1 = j1;
        this.j2 = j2;
        this.marcadorJ1 = new Marcador();
        this.marcadorJ2 = new Marcador();
        this.rondasTotales = rondas;
        
        partidasTotales++;
    }

    public String obtenerNombreJugador() {
        if (tiradaEnRonda < 2) {
            return j1.getNombre();
        } else {
            return j2.getNombre();
        }
    }
    
    /**
     * 
     * @param tiro 
     */
    public void ejecutarTirada(TipoTiro tiro) {
        int bolos = -1;
        if (tiradaEnRonda < 2) {
            bolos = j1.bolosDerribados(tiro);
            marcadorJ1.setBolosDerribados(bolos);
            marcadorJ1.aumentarRonda();
        } else {
            bolos = j1.bolosDerribados(tiro);
            marcadorJ1.setBolosDerribados(bolos);
            marcadorJ1.aumentarRonda();
            
        }
        rondas++;
        rondasTotales++;
        tiradaEnRonda++;
        // Se restablece
        if(tiradaEnRonda > 3){
            tiradaEnRonda = 0;
        }
    }

    static public int getPartidasTotales() {
        return partidasTotales;
    }

    public static int getRondasTotales() {
        return rondasTotales;
    }
    
    
    public void mostrarGanadorFinal(){
        System.out.println("========= RESULTADO FINAL ========");
        System.out.println(j1.getNombre() + " -> " + marcadorJ1.getBolosDerribados() + " puntos");
        System.out.println(j2.getNombre() + " -> " + marcadorJ2.getBolosDerribados() + " puntos");
    }
    
}
