/**
 * La clase empleado se encarga los datos personales del empleado
 * @author mario.sanper.2
 * @version 1.0
 */
public class Empleado {
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	private double salario;
	
	/**
     * Constructor con todos los atributos.
     * @param id Identificador único del empleado.
     * @param nombre Nombre de pila.
     * @param apellidos Apellidos del empleado.
     * @param edad Edad en años.
     * @param salario Salario mensual bruto.
     */
	public Empleado(int id, String nombre, String apellidos, int edad, double salario) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.salario = salario;
	}
	// Getters y Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	/**
     * Devuelve una cadena con la información detallada del empleado.
     * @return String formateado con los datos.
     */
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", salario=" + salario + "]";
	}




}
