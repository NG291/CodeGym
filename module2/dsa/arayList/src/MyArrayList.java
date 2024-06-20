import java.util.ArrayList;

public class MyArrayList<E> implements IMyArrayList<E> {
    private E[] container;

    public MyArrayList() {
        this.container = (E[]) new Object[0];
    }

    @Override
    public void add(E e) {
        E[] newcontainer = (E[]) new Object[container.length + 1];
        for (int i = 0; i < container.length; i++) {
            newcontainer[i] = container[i];
        }
        newcontainer[container.length] = e;
        container = newcontainer;
    }

    @Override
    public E find(int index) {
        if (index >= 0 && index < getSize()) {
            return container[index];
        }
        return null;
    }

    @Override
    public void update(int index, E e) {
        if (index >= 0 && index < getSize()) {
            this.container[index] = e;
        }
    }

    @Override
    public void remove(int index) {
        E[] newconTainer = (E[]) new Object[container.length - 1];
        if (index < 0 && index >= getSize()) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0, j = 0; i < getSize(); i++, j++) {
            if (i == index) {
                j--;
                continue;
            }
            newconTainer[j] = container[i];
        }
        container = newconTainer;
        find(index);
    }

    @Override
    public int getSize() {
        return container.length;
    }

    @Override
    public void read() {
        for (E o : this.container) {
            System.out.println(o);
        }
    }
}
