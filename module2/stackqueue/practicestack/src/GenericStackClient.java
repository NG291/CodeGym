public class GenericStackClient {
    public static void main(String[] args) {
        MyGenericStack<String> MyStack= new MyGenericStack<>();
       System.out.println("1. Stack of integer");
        MyStack.stackOfIStrings();
        System.out.println("2. Stack of integer");
        MyStack.stackOfIntegers();
    }
}
