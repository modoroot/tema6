package actividades.arraysregulares;

/**
 * Clase donde se calculan a partir de diferentes métodos operaciones
 * a un array
 * @author amna
 * @version 1.0
 */
public class TestArraysRegulares {

	public static void main(String[] args) {
		//Inicialización de arrays
		int[] numerosAleatorios = new int[100];
		int[][] numerosAleatoriosBidimensional = new int [75][2];
		//Randomizer del array unidimensional
		for(int i = 1; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i]= (int)(Math.random()*75+1);
		}
		//Muestra las operaciones realizadas en los métodos estáticos
		System.out.println("Array unidimensional"+"\n"+"-------------------"+"\n"
				+"Valor máximo dentro del array: "+TestArraysRegulares.maxValue(numerosAleatorios)+"\n"
				+"Valor mínimo dentro del array: "+TestArraysRegulares.minValue(numerosAleatorios)+"\n"
				+"Media aritmética del array: "+TestArraysRegulares.mediaArit(numerosAleatorios)+"\n");
		//System.out.println(TestArraysRegulares.dupNums(numerosAleatoriosBidimensional));
		//Randomizer del array bidimensional (no está bien lo de veces que se repite x numero
		//porque no he conseguido sacarlo)
		for(int i = 0; i < numerosAleatoriosBidimensional.length; i++) {
			System.out.println();
			for(int j = 0; j <numerosAleatoriosBidimensional[i].length; j++) {
				numerosAleatoriosBidimensional[i][j] = (int) (Math.random()*75+1);
				System.out.println(numerosAleatoriosBidimensional[i][j]);
			}
		}
	}
	//Saca el valor máximo de un array. max se iguala a 1 porque
	//es el mínimo valor que puede salir en el array, para así cada
	//vez que salga un número mayor lo muestre
	public static int maxValue(int[]maxValue) {
		int max = 1;
		for(int i = 1; i < maxValue.length; i++) {
			if(maxValue[i] > max) {
				max=maxValue[i];
			}
		}
		return max;
	}
	//Saca el valor mínimo de un array. min se iguala a 75 porque
	//es el máximovalor que puede salir en el array, para así cada
	//vez que salga un número menor lo muestre
	public static int minValue(int[]minValue) {
		int min = 75;
		for(int i = 1; i < minValue.length; i++) {
			if(minValue[i] < min) {
				min=minValue[i];
			}
		}
		return min;
	}
	//Suma todos los valores guardados en el array y le hace 
	//la media aritmética
	public static double mediaArit(int[]averageArit) {
		double av;
		int sumValues = 0;
		//75
		int length = averageArit.length;
		for(int i = 1; i < averageArit.length; i++) {
			sumValues += averageArit[i];	
		}
		av = sumValues / length;
		return av;
	}

	public static int[][] dupNums(int[][] dupArray) {
		for(int i = 0; i < dupArray.length; i++) {
			for(int j = 0; j <dupArray[i].length; j++) {
				dupArray[i][j] = (int) (Math.random()*75+1);
			}
		}
		return dupArray;
	}

}

