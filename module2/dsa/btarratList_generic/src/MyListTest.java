import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add(0,"Hello");
        list.add(1, "World");
        list.add(2, "Java");
        System.out.println(list);
        System.out.println(list);
    }
}
