/**
 * @author
 * Clase IStack
 * Interfaz de la Pila
 * @version 15/08/2016
 */


public interface IStack <E> {

	//Metodos de la interfaz
	public void Push (E element);
	public E Pop();
	public boolean IsEmpty();
	public int Size();
	public E Get();
	
}
