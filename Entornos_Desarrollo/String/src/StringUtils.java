

	public class StringUtils {
	
		String cadena = "";
	
		static String cadenaInvertida(String cadena) {
			String cadenaInvertida = "";
			if(cadena == null || cadena.isEmpty()) {
				return null;
			}
			for (int i = cadena.length() - 1; i >= 0; i--) {
				cadenaInvertida += cadena.charAt(i);
			}
			return cadenaInvertida;
		}
	
		static int contarVocales (String cadena) {
			int contador = 0;
			if(cadena == null || cadena.isEmpty()) {
				return 0;
			}
			String cadenaMiniscula = cadena.toLowerCase();
			for(int i = 0; i < cadena.length(); i++) {
				char c = cadenaMiniscula.charAt(i);
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					contador++;
				}
			}
		return contador;
	}
}
