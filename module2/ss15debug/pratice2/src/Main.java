import java.util.Random;
import java.util.Scanner;

public class Main {
    public Integer[] CreateRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("List of array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }

    public static void main(String[] args) {
        Main cr = new Main();
        Integer[] arr = cr.CreateRandom();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the index of any element: ");
        int index = sc.nextInt();
        try {
            System.out.println("Fifth element position " + index + "là:" + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter an index between 0 and 99.");
        }
    }
}
