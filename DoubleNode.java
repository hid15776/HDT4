/**
 * @author Gladys De La Roca, Jackeline Hidalgo
 * @version 0.0
 * @date 15/08/2016
 * @file DoubleNode.java
 * 
 */
 
 /**
 * @author Gladys De La Roca, Jackeline Hidalgo
 * @version 0.0
 * @date 15/08/2016
 * @file DoubleNode.java
 * 
 */
public class DoubleNode<E> extends Node<E> {

	private DoubleNode<E> prevElement;
	
	
	/**
	 * @param value: el valor del nodo
	 */
	public DoubleNode(E value) {
		super(value);
		prevElement = null;
	} 
	
	/**
	 * @param value: el valor del nodo
	 * @param next: el enlace al próximo nodo
	 * @param prev: el enlace al nodo anterior
	 */
	public DoubleNode(E value, DoubleNode<E> next, DoubleNode<E>prev){
		super(value, next);
		prevElement = prev;
	}
	
	/**
	 * @return el elemento anterior
	 */
	public DoubleNode<E> getPrevElemenet() {
		return prevElement;
	}

	
	/**
	 * @param prevElemenet: Agrega el elemento siguiente.
	 */
	public void setPrevElemenet(DoubleNode<E> prevElemenet) {
		this.prevElement = prevElemenet;
	}

}
