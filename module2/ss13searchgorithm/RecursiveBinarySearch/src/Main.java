import java.util.AbstractList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int lenght = sc.nextInt();
        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap gia tri mang thu i:" + i);
            int value1 = sc.nextInt();
            array[i] = value1;
        }
        //mảng sắp xếp;
        Arrays.sort(array);
        System.out.println("Nhap gia tri can tim");
        int value = sc.nextInt();
        System.out.println(RecursiveBinarySearch.binarySearch(array, 0, array.length - 1, value));
    }
}
