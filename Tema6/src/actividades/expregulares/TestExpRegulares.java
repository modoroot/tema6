package actividades.expregulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase donde se comprueban cadenas a partir de
 * expresiones regulares
 * @author amna
 * @version 1.0
 */
public class TestExpRegulares {

	public static void main(String[] args) {
		//1. Encuentra (find) dígitos en una cadena
		String cadena="";
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena de caracteres:");
		cadena = sc.nextLine();
		/**
		 * ".*" al principio y al final hace que asegure que al menos esté contenido
		 * el número
		 */
		Pattern pat = Pattern.compile(".*\\d.*");
		Matcher mat = pat.matcher(cadena);
		if(mat.matches()) 
			System.out.println("Tiene un número");
		else 
			System.out.println("No tiene un número");
		//2. Cuenta el número de veces que aparece una palabra en una frase
		System.out.println("Introduce una frase: ");
		cadena = sc.nextLine();
		/**
		 * Comprueba si la palabra java está contenida en una frase y cuántas
		 * veces. \s? es para que el programa tenga en cuenta que puede
		 * haber espacio al principio o al final
		 */
		pat = Pattern.compile("(\\s?)java(\\s?)");
		mat = pat.matcher(cadena);
		while(mat.find()) {
			count++;	
		}
		System.out.println("La palabra java está repetida "+count+" veces");
		//3. Comprobar si una cadena dada contiene exactamente 3 letras([a-z])
		System.out.println("Introduce una cadena de caracteres");
		cadena = sc.nextLine();
		/**
		 * El número entre corchetes asegura que sólo tenga 3 caracteres la cadena
		 */
		pat = Pattern.compile("[A-Za-z]{3}");
		mat = pat.matcher(cadena);
		if(mat.matches()) 
			System.out.println("La cadena contiene 3 letras");
		else 
			System.out.println("La cadena no contiene 3 letras");	
		//4. Comprobar si una cadena puede ser una URL del tipo: https://www.midominio.es
		System.out.println("Introduce un nombre de dominio: ");
		cadena = sc.nextLine();
		/**
		 * Con este patrón asegura que el dominio no empiece por '-',
		 * pero si lo pueda contener. También que la longitud del dominio
		 * tenga que ser mayor o igual a 3 y menor o igual a 63.
		 * También asegura que el TLD solo sean caracteres de mínimo 2
		 * y máximo 6
		 */
		pat = Pattern.compile("^((?!-)[A-Za-z0-9-]{3,63}(?<!-)\\.)+[A-Za-z]{2,6}$");
		mat = pat.matcher(cadena);
		if(mat.matches()) 
			System.out.println("Dominio válido: www."+cadena);
		else 
			System.out.println("Dominio no válido");
		sc.close();
	}

}
