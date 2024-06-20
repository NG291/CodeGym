import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class MyList<E> implements Interface<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int DEFAULT_CAPACITY) {

    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    @Override
    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[index] = e;
        size += 1;
    }

    @Override
    public E remove(int index) {
        E[] newElement = (E[]) new Object[DEFAULT_CAPACITY];

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        E removed = (E)elements[index];

        for (int i = 0, j = 0; i < this.size; i++, j++) {
            if (i == index) {
                j--;
                continue;
                //for (i=0;i<size-1;i++){
//                elements[i]=ele[i+1]
            }
            newElement[j] = (E) elements[i];
        }
        elements = newElement;
        size -= 1;
        return removed;
    }
    @Override
    public int size() {
        return this.size;
    }
    @Override
    public E clone(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E element = (E) elements[index];
        try {
            if (element instanceof Cloneable) {
                return (E) element.getClass().getMethod("clone").invoke(element);
            } else {
                throw new CloneNotSupportedException("Element does not implement Cloneable");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean contains(E e) {
        return indexOf(e) >= 0;
    }

    @Override
    public int indexOf(E e) {
        if (e == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (e.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size] = e;
        size++;
        return true;
    }

    @Override
    public void ensureCapacity(int minCapacity) {
     if (minCapacity > elements.length) {
         int newSize=Math.max(elements.length*2, minCapacity);
         elements = Arrays.copyOf(elements, newSize);
     }
    }

    @Override
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    @Override
    public void clear() {
         for (int i = 0; i < size; i++) {
             elements[i] = null;
         }
         size = 0;
    }
    @Override
    public String toString() {
        String rs = "";
        for (int i = 0; i < this.size; i++) {
            rs += elements[i] + " ";
        }
        return rs;
    }
}

