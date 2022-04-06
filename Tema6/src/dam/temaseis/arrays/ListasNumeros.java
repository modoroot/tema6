package dam.temaseis.arrays;

import java.util.ArrayList;
/**
 * Clase donde se comparan dos ArrayList tipo Integer
 * generados aleatoriamente y se les realizan diferentes 
 * operaciones
 * @author amna
 * @version 1.0
 */
public class ListasNumeros {

	public static void main(String[] args) {
		//Inicialización listas de array tipo Integer
		ArrayList<Integer> listaNumsUno = new ArrayList<Integer>();
		ArrayList<Integer> listaNumsDos = new ArrayList<Integer>();
		ArrayList<Integer> listaNumsUnoUnique = new ArrayList<Integer>();
		int contador = 0;
		System.out.println("Lista 1: ");
		//Generación aletorio de los números del ArrayList hasta 50 inclusive
		for(int i = 0; i<20; i++) {
			listaNumsUno.add((int)(Math.random()*50+1));
			System.out.print(listaNumsUno.get(i)+" ");
		}
		System.out.println();
		System.out.println("Lista 2: ");
		for(int i = 0; i<20; i++) {
			listaNumsDos.add((int)(Math.random()*50+1));
			System.out.print(listaNumsDos.get(i)+" ");
		}
		//Apartado 1
		System.out.println("\n"+"\n"+"Lista con todos los pares de números que podemos formar "
				+ "con uno de lista 1 y otro de lista 2: ");
		/**
		 * Comprueba si un número es par y lo concatena con el mismo número de la posición
		 * equivalente de lista 2
		 */
		for(int i = 0; i<20; i++) {
			if(listaNumsDos.get(i)%2==0) {
				String newNum = listaNumsUno.get(i).toString().concat(listaNumsDos.get(i).toString());
				System.out.print(newNum+" ");
			}
		}
		//Apartado 2
		/**
		 * Comprueba si un número es par y lo concatena con el mismo número de la posición
		 * equivalente de lista 1
		 */
		System.out.println("\n"+"\n"+"Lista con todos los pares de números que podemos formar "
				+ "con uno de lista 2 y otro de lista 1: ");
		for(int i = 0; i<20; i++) {
			if(listaNumsUno.get(i)%2==0) {
				String newNum = listaNumsDos.get(i).toString().concat(listaNumsUno.get(i).toString());
				System.out.print(newNum+" ");
			}
		}
		//Apartado 3
		System.out.println("\n"+"\n"+"Lista con todos los elementos "
				+ "de la lista del punto 1 que existen en la lista del punto 2: ");
		for(int i = 0; i<20; i++) {
			if(listaNumsUno.get(i).equals(listaNumsDos.get(i))==true) {
				contador++;
				System.out.print(listaNumsUno.get(i)+" ");
			}
			else if(contador==0 && i==19) {
				System.out.println("Ningún número de lista 1 coincide con los "
						+ "de lista 2");
			}
		}
		//Apartado 4
		System.out.println("\n"+"\n"+"Mostrar los elementos de lista 1 sin repetición: ");
		for(Integer i : listaNumsUno) {
			if(!listaNumsUnoUnique.contains(i)) {
				listaNumsUnoUnique.add(i);
			}
		}
		System.out.println(listaNumsUnoUnique);

		//Apartado 5
		System.out.println("\n"+"\n"+"Mostrar los elementos de lista 2 que no están en lista 1 ");
		/**
		 * Bucle for-each que recorre el ArrayList listaNumsDos y comprueba si están en listaNumsUno.
		 * Si no están, los muestra
		 */
		for(Integer i : listaNumsDos) {
			if(!listaNumsUno.contains(i)) {
				System.out.print(i+" ");
			}
		}
	}


}
