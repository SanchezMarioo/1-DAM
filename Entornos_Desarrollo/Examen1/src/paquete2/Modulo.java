package paquete2;

public class Modulo {
	public Modulo(String nombre, int horas, String curso) {
		super();
		this.nombre = nombre;
		this.horas = horas;
		this.curso = curso;
	}
	String nombre;
	@Override
	public String toString() {
		return "Modulo [nombre=" + nombre + ", horas=" + horas + ", curso=" + curso + "]";
	}
	int horas;
	String curso;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}
