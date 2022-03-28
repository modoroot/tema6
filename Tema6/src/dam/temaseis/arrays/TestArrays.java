package dam.temaseis.arrays;

public class TestArrays {

	public static void main(String[] args) {
		int[][] tablero = new int[4][];
		//cada vez que cambio de fila, el numero de columnas se incrementan 
		//en una unidad
		for (int i = 0; i < tablero.length; i++) {
			tablero[i] = new int [i+1];
			tablero[i][0] = 2*i+1;
			System.out.print(tablero[i][0]+"\t");
			for(int j=1; j<tablero[i].length;j++) {
				tablero[i][j]=(2*i+1)*(j+i);
				//se muestran los siguientes elementos, al primero de cada fila
				System.out.print(tablero[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
