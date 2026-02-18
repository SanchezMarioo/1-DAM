/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente_servidor;

/**
 *
 * @author mario.sanper.2
 */
public class Servidor {

    private String ip;
    private final int MAX_CLIENTES = 10;
    private Cliente[] lista_cliente;

    public Servidor(String ip) {
        // Comprobar si la IP es correcta
        // Incializar el array de clientes 
    }

    /**
     * Mostrar el menu del servidor
     */
    public void init() {

    }

    public void respuesta() {

    }

    /**
     * Comprueba si es una IP es valida
     *
     * @param ip ip que va a comprobar
     * @return true si es correcta, false si es contraria
     */
    private boolean comprobarIP(String ip) {
        String[] obtetos = ip.split("\\.");
        if(ip.trim() == "" || ip.isEmpty()){
            return false;
        }
        // Se comprueba si hay 4 . 
        if (obtetos.length != 4) {
            return false;
        }
        for (int i = 0; i < ip.length(); i++) {
            char c = ip.charAt(i);
            if (c < 0 || c > 9) {
                return false;
            }
        }
        int obtetosNumeros[] = new int [obtetos.length];
        for (int i = 0; i < obtetos.length; i++) {
            obtetosNumeros[i] = Integer.parseInt(obtetos[i]);
        }
        for (int i = 0; i < obtetosNumeros.length; i++) {
            if (obtetosNumeros[i] < 0 || obtetosNumeros[i] > 254){
                return false;
            }
        }
        return true;
    }

    private void enlazarCliente(Cliente cliente) {
        // Comprobar si tiene espacio 
        // Comprobar que el cliente tiene una IP estructuralmente correcta 
        // Comprobar que la IP de el cliente no esta repetida
        // -> ok -> Asigna a su listado de clientes el nuevo cliente y le notifica que es su servidor 
        // -> Error -> rehusa del cliente => no hacer nada. Muestra un mensaje de error 
    }

    public String getIp() {
        return ip;
    }

}
