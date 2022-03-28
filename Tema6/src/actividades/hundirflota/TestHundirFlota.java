package actividades.hundirflota;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase lanzadora de la aplicación de Hundir la Flota.
 * Realizada a partir de Arraylist 
 * @author amna
 * @version 1.0
 */
public class TestHundirFlota {
	//Declaración Array bidimensional que guardará el tamaño del océano
	static String[][] oceano = new String[8][8];
	public static void main(String[] args) {
		//Opción océano
		int tamanioOceano;
		//Estados de las casillas
		ArrayList<String> ocupadas=new ArrayList<String>();
		ArrayList<String> repetidas=new ArrayList<String>();
		ArrayList<String> posFinal=new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Consiste en hundir barquitos"+"\n"+"Selecciona"
				+ " el tamaño del océano: ");
		System.out.println("1. 4x4"+"\n"+"2. 6x6"+"\n"+"3. 8x8");
		tamanioOceano = sc.nextInt();
		switch(tamanioOceano) {
		case 1:
			rellenarCuatroPorCuatro();
			mostrarCuatroPorCuatro();
			break;
		case 2:
			rellenarSeisPorSeis();
			mostrarSeisPorSeis();
			break;
		case 3:
			rellenarOchoPorOcho();
			mostrarOchoPorOcho();
			break;
		}
		sc.close();
	}
	/**
	 * Método estático que crea un océano 4x4
	 */
	public static void rellenarCuatroPorCuatro() {
		char asteriscos = (char)42;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				//Wrapper que convierte el 42 en '*'
				oceano[i][j]=Character.toString(asteriscos);
			}
		}
	}
	/**
	 * Método estático que crea un océano 6x6
	 */
	public static void rellenarSeisPorSeis() {
		char asteriscos = (char)42;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				//Wrapper que convierte el 42 en '*'
				oceano[i][j]=Character.toString(asteriscos);
			}
		}
	}
	/**
	 * Método estático que crea un océano 8x8
	 */
	public static void rellenarOchoPorOcho() {
		char asteriscos = (char)42;
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				//Wrapper que convierte el 42 en '*'
				oceano[i][j]=Character.toString(asteriscos);
			}
		}
	}
	/**
	 * Método estático que muestre el océano
	 */
	public static void mostrarCuatroPorCuatro() {
		 for(int i=0;i<4;i++){
	            for(int j=0;j<4;j++){
	                System.out.print(oceano[i][j]+" ");
	            }
	            System.out.println();
	        }
	}
	/**
	 * Método estático que muestre el océano
	 */
	public static void mostrarSeisPorSeis() {
		 for(int i=0;i<6;i++){
	            for(int j=0;j<6;j++){
	                System.out.print(oceano[i][j]+" ");
	            }
	            System.out.println();
	        }
	}
	/**
	 * Método estático que muestre el océano
	 */
	public static void mostrarOchoPorOcho() {
		 for(int i=0;i<8;i++){
	            for(int j=0;j<8;j++){
	                System.out.print(oceano[i][j]+" ");
	            }
	            System.out.println();
	        }
	}

}
