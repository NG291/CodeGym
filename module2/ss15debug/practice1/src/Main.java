import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a:");
        double a = sc.nextDouble();
        System.out.println("Nhap vao so b:");
        double b = sc.nextDouble();
        if (a != 0.0) { a=2.0;
            double solution = -b / a;
            System.out.println("ket qua: " + solution);
        } else {
            System.out.println("Solution is all x! ");
        }

        System.out.println(" no Solution!");
    }
}

