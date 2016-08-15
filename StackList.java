/**
 * @author Gladys de la Roca, Jackeline Hidalgo
 * StackList
 * @version 15/08/2016
 */

import java.util.List;
import javax.swing.JOptionPane;

public class StackList<E> extends AbstractStack<E>{
	public ListFactory factorList = new ListFactory();
    	protected List<E> data = (List<E>) factorList.getList(parametro());
    	String opcion; 

	public String parametro(){
		int option1 = 0;
		while (option1 == 0){
			System.out.println("[1] ArrayList");
			System.out.println("[2] Vector");
			System.out.println("[3] Lista");
			System.out.print("Seleccione la implementacion para la pila que desee: ");
			try{
				option1 = Integer.parseInt(keyboard.nextLine());
			}
			catch (NumberFormatException e){
				System.out.println();
				System.out.println("Error: opcion invalida");
				System.out.println();
				option1 = 0;
			}
		return opcion1;
		}
	}

	public void Push(E element)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(element);
	}

	public E Pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

	public E Get()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
	public int Size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
	public boolean IsEmpty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
}
