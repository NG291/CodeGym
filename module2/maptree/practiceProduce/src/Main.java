import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ManagerProduct mana = new ManagerProduct<>();
        Product p1 = new Product("1", " thìa", 40);
        Product p2 = new Product("2", " bat", 43);
        Product p23 = new Product("1", "bcs", 14);
        mana.addProduct(p1);
        mana.addProduct(p2);
        mana.addProduct(p23);
        System.out.println("Mảng trước khi sắp xếp");
        mana.Display();
        System.out.println("Mảng sau khi sắp xếp tăng dần");
        mana.sortAscendingProduct();
        mana.Display();
        System.out.println("Mảng sau khi sắp xếp giảm dần");
        mana.sortProductsByPriceDescending();
        mana.Display();

    }
}