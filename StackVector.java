/**
 * @author Gladys de la Roca, Jackeline Hidalgo
 * StackVector
 * @version 15/08/2016
 */
 
import java.util.Vector;

public class StackVector<E> extends AbstractStack<E>{
	protected   Vector<E> data;
    	protected   int indice   = 0;
    
    	public StackVector(){
 	// pre: no se necesita
	// post: constructor de una pila
        	data = new Vector<E>();
    	}
    
    	public void Push(E element) {
        // pre: no se necesita
        // post: un nuevo dato se guarda en la pila
        	data.add(element);
    	}

	public E Pop() {    
        // pre: se realiza solamente si la pila tiene algun dato guardado
        // post: se saca de la pila el Ãºltimo dato guardado
        	E element = data.lastElement();
        	data.remove(data.size()-1);
        	return element;
    	}
    
    	public E Get() {
        // pre: se realiza solamente si la pila tiene algun dato guardado
        // post: indica cual ue el ultimo dato guardado
        	return data.get(size() - 1);
    	}

    
    	public boolean IsEmpty() {
        // pre: no se necesita
        // post: devuelve true si la pila esta vacia y false si tiene algun dato guardado
        	return size() == 0;
    	}

    	public int Size() {
        // pre: no se necesita
        // post: cuenta la cantidad de datos en la pila
        return data.size();
    	}
}
