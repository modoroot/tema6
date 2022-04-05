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
		Scanner sc = new Scanner(System.in);
		//do {

		//Añadimos los elementos a la lista
		Empleado emp1 = new Empleado("Bicho", "Pelao", "83282348A", LocalDate.parse("2022-02-13"));
		Empleado emp2 = new Empleado("Pulga", "Calva", "32942949X", LocalDate.parse("2020-12-11"));
		Empleado emp3 = new Empleado("Rana", "Afeitada", "23894823Y", LocalDate.parse("2005-07-28"));
		Empleado emp4 = new Empleado("Caballo", "Rapao", "65865495R", LocalDate.parse("2015-05-01"));
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

		opcion = sc.nextInt();

		switch(opcion) {
		case 1:
			ListasEj1.buscarEmp();
			break;
		case 2:
			ListasEj1.modEmp();
			break;
		case 3:
			ListasEj1.delEmp();
			break;
		case 4:
			ListasEj1.addEmp();
			break;
		case 5:
			ListasEj1.sortEmp();
			break;
		}
		sc.close();
		//}
		//while(opcion!=6); 
		//System.exit(0);
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
		System.out.println("Selecciona el empleado (escribe su NIF): ");
		for(int i = 0; i < listaEmp.size(); i++) {
			System.out.println(listaEmp.get(i).getNif());
		}
		Scanner sc = new Scanner(System.in);
		Empleado empleado = new Empleado(sc.next());
		//Recorre el ArrayList listaEmp buscando si coincide
		//algún NIF con el introducido por consola
		for(int i = 0; i<listaEmp.size();i++) {
			Empleado e = listaEmp.get(i);
			if(e.getNif().equals(empleado.getNif())) {
				System.out.println("Introduce el nuevo NIF: ");
				Empleado empNif = new Empleado(sc.next());
				e.setNif(empNif.getNif());
				System.out.println(listaEmp.toString());
			}
		}
		sc.close();
	}
	public static void delEmp() {
		System.out.println("Selecciona el empleado (escribe su NIF): ");
		for(int i = 0; i < listaEmp.size(); i++) {
			System.out.println(listaEmp.get(i).getNif());
		}
		Scanner sc = new Scanner(System.in);
		Empleado empleado = new Empleado(sc.next());
		//Recorre el ArrayList listaEmp buscando si coincide
		//algún NIF con el introducido por consola
		for(int i = 0; i<listaEmp.size();i++) {
			Empleado e = listaEmp.get(i);
			if(e.getNif().equals(empleado.getNif())) {
				listaEmp.remove(i);
				System.out.println(listaEmp.toString());
			}
		}
		sc.close();
	}
	public static void addEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce sus datos de la siguiente forma:"+"\n"
				+ "Nombre"+"\n"+"Apellidos"+"\n"+"NIF");
		listaEmp.add(new Empleado(sc.next(), sc.next(), sc.next(), LocalDate.now()));
		System.out.println(listaEmp.toString());
		sc.close();
	}
	public static void sortEmp() {
		int opcion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el parámetro por el cual quieres ordenar la lista: "+"\n"+
				"1. Nombre"+"\n"+"2. Apellidos"+"\n"+"3. NIF"+"\n"+"4. Fecha alta");
		opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			Collections.sort(listaEmp, new Comparator<Empleado>() {
				@Override
				public int compare(Empleado e1, Empleado e2) {
					return new String(e1.getNombre()).compareTo(new String(e2.getNombre()));
				}
			});
			System.out.println(listaEmp.toString());
			break;
		case 2:
			Collections.sort(listaEmp, new Comparator<Empleado>() {
				@Override
				public int compare(Empleado e1, Empleado e2) {
					return new String(e1.getApellidos()).compareTo(new String(e2.getApellidos()));
				}
			});
			System.out.println(listaEmp.toString());
			break;
		case 3:
			Collections.sort(listaEmp, new Comparator<Empleado>() {
				@Override
				public int compare(Empleado e1, Empleado e2) {
					return new String(e1.getNif()).compareTo(new String(e2.getNif()));
				}
			});
			System.out.println(listaEmp.toString());
			break;
		case 4:
			Collections.sort(listaEmp, new Comparator<Empleado>() {
				@Override
				public int compare(Empleado e1, Empleado e2) {
					return new String(e1.getFechaAlta().toString())
							.compareTo(new String(e2.getFechaAlta().toString()));
				}
			});
			System.out.println(listaEmp.toString());
			break;
		}
		sc.close();
	}

}
