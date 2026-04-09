public class App {

    private static final int NUMERO_CUATRO = 4;

	public static void main(String[] args) {
        App app = new App();
        funcionSumar(app, null);

        app.mostrarMensaje("Hola desde la aplicación Java!");

        int numero = NUMERO_CUATRO;
        int calcularCuadrado = app.calcularCuadrado(numero);
		System.out.println("El cuadrado de " + numero + " es " + calcularCuadrado);
    }

	private static void funcionSumar(App app, String cadena) {
		int resultado = app.sumar(5, 3);
        System.out.println("Resultado: " + resultado);
	}

    public int sumar(int a, int b) {
        return a + b;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public int calcularCuadrado(int n) {
        return n * n;
    }
}
