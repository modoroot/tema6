package dam.temaseis.arrays;

import java.time.LocalDate;
import java.util.Scanner;
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
	
	public Empleado(String nif) {
		this.nif = nif;
	}
	/**
	 * Constructor principal
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param fechaAlta
	 */
	public Empleado(String nombre, String apellidos, String nif, LocalDate fechaAlta) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.fechaAlta = fechaAlta;
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
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", fechaAlta=" + fechaAlta
				+ "]"+"\n";
	}

}
