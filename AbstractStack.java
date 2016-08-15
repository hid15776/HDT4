/**
 * @author Gladys de la Roca, Jackeline Hidalgo
 * AbstractStack
 * @version 15/08/2016
 */

abstract public class AbstractStack<E> implements Stack<E>
{
      public boolean empty(){
      // post: regresa true si el stack esta vacio
      return size() == 0;
   }
}
