package dam.temaseis.arrays;

import java.time.LocalDate;

/**
 * Clase que define las propiedades, métodos y constructores de
 * los empleados
 * @author amna
 * @version 1.0
 */
public class Empleado {
	private String nombre;
	private String apellidos;
	private String nif;
	private LocalDate fechaAlta;

	/**
	 * Constructor principal
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param fechaAlta
	 */
	public Empleado(String nombre, String apellidos, String nif, LocalDate fechaAlta) {
		this(nif);
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaAlta = fechaAlta;
	}
	/**
	 * Constructor creado para los métodos buscarEmp(), modEmp()
	 * @param nif
	 */
	public Empleado(String nif) {
		this.nif = nif;
	}
	//Getters-Setters
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
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", fechaAlta=" + fechaAlta
				+ "]"+"\n";
	}

}
