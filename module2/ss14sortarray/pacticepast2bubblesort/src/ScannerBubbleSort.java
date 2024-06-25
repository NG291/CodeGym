import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Collections;
import java.util.Scanner;

public class ScannerBubbleSort {
    public static void bubbleSort(int[] list) {
        boolean needNextPast = true;
        for (int i = 1; i < list.length && needNextPast; i++) {
            needNextPast = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPast = true;
                }
            }
            if (needNextPast == false) {
                System.out.println("heloo em");
            }
            System.out.print("List after the  " + i + "' sort: ");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k] + "\t");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        bubbleSort(list);


    }

}


