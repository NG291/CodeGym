//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyLinkedListTest {
   public static void main(String[] args) {
       System.out.println("/=/=/=/= TESTING /=/=/=/=");
       MyLinkedList ll= new MyLinkedList(10);
       ll.addFirst(11);
       ll.addFirst(12);
       ll.addFirst(13);

       ll.add(4,7);
       ll.add(4,9);
       ll.printList();
   }

}