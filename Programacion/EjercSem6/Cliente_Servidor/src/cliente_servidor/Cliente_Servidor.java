/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente_servidor;

/**
 *
 * @author mario.sanper.2
 */
public class Cliente_Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente[] cliente = new Cliente[10];
        // Creara varios clientes (unos con IP invalida y con valida)
        // Crea un servidor con IP invalida

        // Crea un servidor con IP valida
        //Crea otro cliente
        //Enlazamos todos los clientes con el servidor 
        // Lanzamos el metodo init del servidor -> produce un metodo en bucle 
        comprobarIP("127.1.1.1");
    }

    static private boolean comprobarIP(String ip) {
        String[] obtetos = ip.split("\\.");
        if (ip.trim().isEmpty()) {
            return false;
        }
        // Se comprueba si hay 4 . 
        if (obtetos.length != 4) {
            return false;
        }
        for (int i = 0; i < obtetos.length; i++) {
            char c = obtetos[i].charAt(i);
            if(c)
        }

        int obtetosNumeros[] = new int[obtetos.length];
        for (int i = 0; i < obtetos.length; i++) {
            obtetosNumeros[i] = Integer.parseInt(obtetos[i]);
        }
        for (int i = 0; i < obtetosNumeros.length; i++) {
            if (obtetosNumeros[i] < 0 || obtetosNumeros[i] > 254) {
                return false;
            }
        }
        return true;
    }

}
