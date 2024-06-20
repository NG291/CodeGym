public interface IMyLinkedList<E> {
   void add(int index, E element);
   void addFirst(E element);
   void addLast(E element);
   E remove(int index);
   boolean remove(Object e);
    int size();
     E clone();
     boolean contains(E o);
     int indexOf(E o);
     boolean add(E e);
     void ensureCapacity(int minCapacity);
     E get(int index);
     E getFirst();
     E getLast();
     void clear();
}
