import java.util.LinkedList;

public class ReverseArrayStack <T>{
    private LinkedList<T> stack;

    ReverseArrayStack() {
        this.stack = new LinkedList<>();
    }

    public void push(T t) {
        stack.add(t);
    }

    public void pop() {
        stack.removeFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
    public static void IntegerStack(int number){
        ReverseArrayStack<Integer> InReverse= new ReverseArrayStack<>();
        InReverse.push(number);

    }
    public static void StringStack(String s){
        ReverseArrayStack<String> StrReverse= new ReverseArrayStack<>();
        StrReverse.push(s);
    }

}
