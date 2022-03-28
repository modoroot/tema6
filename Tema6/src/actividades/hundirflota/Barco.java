package actividades.hundirflota;

import java.util.ArrayList;

public class Barco {
	private int size;
	private String position;
	private ArrayList<Integer> rows = new ArrayList<Integer>();
	private ArrayList<Integer> cols = new ArrayList<Integer>();
	/**
	 * Constructor principal de la clase que contiene las propiedades
	 * de un barco
	 * @param size
	 * @param position
	 */
	public Barco(int size, String position) {
		this.size = size;
		this.position = position;
	}
	/**
	 * 
	 * @return devuelve el tamaño del ArrayList rows
	 */
	public int posx() {
		return this.rows.size();
	}
	/**
	 * 
	 * @param row Actualiza la posición elegida a tocado
	 * @param col Actualiza la posición elegida a tocado
	 */
	public void tocado(int rowShooted, int colShooted) {
		this.rows.add(rowShooted);
		this.cols.add(colShooted);
	}
	
	//Getters-Setters
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}
