/**
 * @author Gladys de la Roca, Jackeline Hidalgo
 * Clase Main
 * Main del programa
 * @version 15/08/2016
 */

public class ListFactory<E> {
    public IList<E> getIList(String entry){
        if(entry.equals("1"))
            return new SingleLinkedList<E>();
        if(entry.equals("2"))
            return new DoubleLinkedList<E>();
        if(entry.equals("3"))
            return new CircularLinkedList<E>();
        else 
            return null;
    
    }
}
