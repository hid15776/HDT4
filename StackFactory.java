/**
 *StackFactory
 * @author Gladys de la Roca, Jackeline Hidalgo
 */
public class StackFactory {
	public Stack<E> getStack(String entry) {
	    if(entry.equals("1"))
	        return new StackArrayList<E>();
	    if(entry.equals("2"))
	        return new StackVector<E>();
	    if(entry.equals("3"))
	        return new StackList<E>();
	    else 
	        return null;
	    }
}
