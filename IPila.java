/**
 * @author
 * Clase I_Pila
 * Interfaz de la Pila
 * @version 24/07/2016
 */


public interface IPila <E> {

	//Metodos de la interfaz
	public void Push (E element);
	public E Pop();
	public boolean IsEmpty();
	public int Size();
	public E Get();
	
}
