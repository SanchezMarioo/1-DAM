import java.util.ArrayList;

public class Gestion {
	private ArrayList<Empleado> listaEmpleados;



	public Gestion() {
		this.listaEmpleados = new ArrayList<>();
	}
	public void añadirEmpleado(Empleado empleado) {
		listaEmpleados.add(empleado);
	}

	public void modificarEmpleado(int id, String nuevoNombre, double nuevoSalario) {
		for (Empleado element : listaEmpleados) {
			if (element.getId() == id) {
				element.setNombre(nuevoNombre);
				element.setSalario(nuevoSalario);
				System.out.println("Datos actualizados.");
				return;
			}
		}
	}
	public void eliminarEmpleado(int id) {
		for (int i = 0; i < listaEmpleados.size(); i++) {
			if (listaEmpleados.get(i).getId() == id) {
				listaEmpleados.remove(i);
				System.out.println("El empleado " + listaEmpleados.get(i).getNombre() + "ha sido borrado");
				return;
			}
		}
	}
	public void listarEmplados() {
		for (int i = 0; i < listaEmpleados.size(); i++) {
			System.out.println(i + " "+ listaEmpleados.get(i).getNombre());
		}
	}


}
