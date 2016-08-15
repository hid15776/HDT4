import java.util.Iterator;
/**
 * @author Gladys De La Roca, Jackeline Hidalgo
 * @version 0.0
 * @date 15/08/2016
 * @file L.java
 * 
 */


public interface List<E> {
   public int size();
   public boolean IsEmpty();
   public void clear();
   public void addFirst(E value);
   public void addLast(E value);
   public E getFirst();
   public E getLast();
   public E removeFirst();
   public E removeLast();
   public E remove(E value);
   public void add(E value);
   public E remove();
   public E get();
   public boolean contains(E value);
   public int indexOf(E value);
   public int lastIndexOf(E value);
   public E get(int i);
   public E set(int i, E o);
   public void add(int i, E o);
   public E remove(int i);
   public Iterator<E> iterator();

}
