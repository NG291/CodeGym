public interface Interface<E> {
    public void add(int index, E e);
    E remove(int index);
    int size();
     E clone(int index);
    boolean contains(E e);
    int indexOf(E e);
    boolean add(E e);
    void ensureCapacity(int minCapacity);
    E get(int index);
    void clear();
}
