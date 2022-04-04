package dam.temaseis.arrays;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Clase lanzadora de la clase Empleado con un menú incorporado
 * @author amna
 * @version 1.0
 */
public class ListasEj1 {
	//Inicialización de lista de los empleados. Static para poder usarlo en métodos
	//de la clase Empleado
	private static ArrayList<Empleado> listaEmp = new ArrayList<Empleado>();
	public static void main(String[] args) {
		int opcion = 0;
		//Añadimos los elementos a la lista
		Empleado emp1 = new Empleado("Nombre1", "Apellidos1", "12345678A", LocalDate.parse("2022-02-13"));
		Empleado emp2 = new Empleado("Nombre2", "Apellidos2", "87654321A", LocalDate.parse("2020-12-11"));
		Empleado emp3 = new Empleado("Nombre3", "Apellidos3", "12345678B", LocalDate.parse("2005-07-28"));
		Empleado emp4 = new Empleado("Nombre4", "Apellidos4", "87654321B", LocalDate.parse("2015-05-01"));
		listaEmp.add(emp1);
		listaEmp.add(emp2);
		listaEmp.add(emp3);
		listaEmp.add(emp4);
		/**
		 * A partir del método de Collections sort, ordenamos el ArrayList a partir del método
		 * compareTo a partir del NIF de los empleados
		 */
		Collections.sort(listaEmp, new Comparator<Empleado>() {
			@Override
			public int compare(Empleado e1, Empleado e2) {
				return new String(e1.getNif()).compareTo(new String(e2.getNif()));
			}
		});
		System.out.println("1. Buscar empleado por NIF"+"\n"+
				"2. Modificar un empleado de la lista"+"\n"+
				"3. Eliminar un empleado de la lista"+"\n"+
				"4. Añadir un nuevo empleado"+"\n"+
				"5. Ordenar la lista de empleados por una propiedad indicada como parámetro"+"\n"+
				"6. Salir");
		Scanner sc = new Scanner(System.in);
		opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			ListasEj1.buscarEmp();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			System.exit(0);
			break;
		}
		sc.close();
	}
	/**
	 * Método estático que busca si existe el NIF introducido de un empleado
	 */
	public static void buscarEmp() {
		boolean existe = false;
		System.out.println("Introduce el NIF del empleado: ");
		Scanner sc = new Scanner(System.in);
		Empleado empleado = new Empleado(sc.next());
		//Recorre el ArrayList listaEmp buscando si coincide
		//algún NIF con el introducido por consola
		for(int i = 0; i<listaEmp.size();i++) {
			Empleado e = listaEmp.get(i);
			if(e.getNif().equals(empleado.getNif())) {
				existe = true;
				System.out.println(e.toString());
				break;
			}
		}
		if(existe==false)
			System.out.println("No existe ese empleado");
		sc.close();
	}
	public static void modEmp() {
		
	}
}
