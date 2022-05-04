package dam.temaseis.listas;

import java.util.Comparator;

public class ListaSimpleJava<T> {
	//mantiene la ref al primer elemento de la lista
	private NodoLista<T> inicio=null;
	private int size;
	public void add(NodoLista<T> nodoLista) {
		//si la lista está vacía, el nuevo nodo
		//es el primero y el último
		if(this.isEmpty()) {
			this.inicio = nodoLista;
			this.inicio.setSiguiente(null);
		}else {
			//si la lista no está vacía hay que recorrerla desde el
			//inicio hasta el final
			NodoLista<T> actual = inicio;
			while(actual.getSiguiente()!=null) {
				actual=actual.getSiguiente();
			}
			//final lista
			actual.setSiguiente(nodoLista);
		}
	}
	public boolean insert(NodoLista<T> nodoLista, int pos) {
		int index = 1;
		NodoLista<T> actual = null;
		//lista vacía
		if(this.isEmpty()) return false;
		//posición de inserción no es correcta
		if(pos<1 || pos>(this.getSize()+1))
			return false;
		//insertar al principio de la lista
		if(pos==1) {
			nodoLista.setSiguiente(this.inicio);
			this.inicio = nodoLista;
			this.size++;
			return true;
		}else if(pos==this.size || pos == (this.size+1)) {
			//insertar al final
			actual = this.inicio;
			while(actual.getSiguiente()!=null) {
				actual=actual.getSiguiente();
			}
			actual.setSiguiente(nodoLista);
			this.size++;
			return true;
		}else {
			//insertar en medio
			actual = this.inicio;
			while(index<pos-1) {
				index++;
				actual = actual.getSiguiente();
			}
			nodoLista.setSiguiente(actual.getSiguiente());
			actual.setSiguiente(nodoLista);
			this.size++;
			return true;
		}

	}
	public NodoLista<T> delete(NodoLista<T> nodo) {
		NodoLista<T> toDelete = null;
		return toDelete;
	}
	public NodoLista<T> get(T info){
		NodoLista<T> find=null;
		return find;
	}
	public void sort(Comparator comp) {

	}
	public boolean isEmpty() {
		return inicio ==null;
	}
	public int getSize() {
		return size;
	}

}
