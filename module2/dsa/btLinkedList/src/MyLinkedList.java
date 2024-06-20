import javax.xml.soap.Node;

public class MyLinkedList<E> implements IMyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node temp = head;
        Node holder;

        if (index == 0) {
            addFirst(element);
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(element);
            temp.next.next = holder;
            numNodes++;
        }
    }

    @Override
    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    @Override
    public void addLast(E element) {
        Node temp = head;
        if (temp == null) {
            addFirst(element);
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(element);
            numNodes++;
        }
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node temp = head;

        if (index == 0) {
            head = head.next;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            Node toRemove = temp.next;
            temp.next = temp.next.next;
            numNodes--;
            return (E) toRemove.getData();
        }
        numNodes--;
        return (E) temp.getData();
    }

    @Override
    public boolean remove(Object e) {
        if (head == null) {
            return false;
        }
        if (head.getData().equals(e)) {
            head = head.next;
            numNodes--;
            return true;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.getData().equals(e)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public int size() {
        return numNodes;
    }

    @Override
    public E clone() {
        MyLinkedList<E> clone = new MyLinkedList<>();
        Node temp = head;
        while (temp != null) {
            clone.addLast((E) temp.getData());
            temp = temp.next;
        }
        return (E) clone;
    }

    @Override
    public boolean contains(E o) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData().equals(o)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(o)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    @Override
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override
    public void ensureCapacity(int minCapacity) {
        // LinkedList does not require ensuring capacity as it dynamically grows.
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    @Override
    public E getFirst() {
        if (head == null) {
            throw new NullPointerException("The list is empty");
        }
        return (E) head.getData();
    }

    @Override
    public E getLast() {
        if (head == null) {
            throw new NullPointerException("The list is empty");
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    @Override
    public void clear() {
        head = null;
        numNodes = 0;
    }
}
