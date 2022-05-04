package dam.temaseis.listas;

import java.util.Comparator;

public class NodoLista<T> implements Comparator {
	private T info;
	private NodoLista<T> siguiente;
	public NodoLista(T info, NodoLista<T> siguiente) {
		this.info=info;
		this.siguiente=siguiente;
	}
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	public NodoLista<T> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoLista<T> siguiente) {
		this.siguiente = siguiente;
	}
	@Override
	public int compare(Object o1, Object o2) {
		NodoLista<T> nodo1, nodo2;
		//comprobar nulidad
		if(o1==null || o2==null)
			throw new NullPointerException();
		//comprobar tipo
		if(!(o1 instanceof NodoLista) && !(o2 instanceof NodoLista))
			throw new ClassCastException();
		//comprobar igualdad
		nodo1 = (NodoLista<T>)o1;
		nodo2 = (NodoLista<T>)o2;
		return 0;
	}
	
}
