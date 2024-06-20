package src;

public interface IManagerUse<E> {
    void add(E e);
    void remove(E e);
    void clear();
    void find(int index);
    void fillAll();
}
