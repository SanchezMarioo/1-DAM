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
     * @param nombre Nombre del empleado.
     * @param apellidos Apellidos del empleado.
     * @param edad Edad del empleado en años.
     * @param salario Salario mensual.
     */
	public Empleado(int id, String nombre, String apellidos, int edad, double salario) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.salario = salario;
	}
	// Getters y Setters
	


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
     * Devuelve una cadena con la información del empleado.
     * @return String formateado con la informacion del empleadoi.
     */
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", salario=" + salario + "]";
	}


}
