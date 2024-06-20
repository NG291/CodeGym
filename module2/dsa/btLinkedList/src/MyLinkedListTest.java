public class MyLinkedListTest {
    public static void main(String[] args) {
        // Test add, addFirst, addLast, size, get methods
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(1);
        list.addFirst(0);
        list.add(2, 2);

        System.out.println("List after adding elements: " + list.toString());

        System.out.println("Size of list: " + list.size());

        // Test get methods
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Element at index 2: " + list.get(2));

        // Test remove methods
        System.out.println("Removed element at index 1: " + list.remove(1)); 

        System.out.println("List after removing element: " + list.toString());

        // Test other methods such as contains, indexOf, clone, etc.
        System.out.println("Does list contain 2? " + list.contains(2));
        System.out.println("Index of element 2: " + list.indexOf(2));


        System.out.println("First element of list: " + list.getFirst());
        System.out.println("Last element of list: " + list.getLast());


        list.clear(); // Clear the list
        System.out.println("List after clearing: " + list.toString());
    }
}
