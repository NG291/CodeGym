public interface IMyArrayList<E> {
    void add(E e);
    E find (int index);
    void update(int index, E e);
    void remove(int index);
    int getSize();
    void read();
}
