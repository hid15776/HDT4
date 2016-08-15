import java.util.Iterator;
/**
 * @author Estructura de Datos
 * @version 0.0
 * @date 15/08/2016
 * @file DoublyLinkedList.java
 * Implementa una lista doblemente enlazada
 * 
 */
public class DoubleLinkedList<E> extends AbstractList<E> {
	/**
	 * Atributos
	 */
	private DoubleNode<E> head;
	private DoubleNode<E> tail;
	private int count;

	
	public DoubleLinkedList(DoubleNode<E> head, DoubleNode<E> tail, int count) {
		this.head = head;
		this.tail = tail;
		this.count = count;
	}


	public DoubleLinkedList() {
		count = 0;
		head = null; 
		tail = null;
	}

	public void addFirst(E value){
		head = new DoubleLinkedList<E>(value, head, null);
		if (tail == null) tail = head;
		count++;
	}

	public DoubleNode<E> getHead() {
		return head;
	}
	
	public void setHead(DoubleNode<E> head) {
		this.head = head;
	}
	
	public DoubleNode<E> getTail() {
		return tail;
	}
	
	public void setTail(DoubleNode<E> tail) {
		this.tail = tail;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	

}
