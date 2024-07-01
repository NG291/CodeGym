
import java.util.Scanner;

public class ThreeTriangleSides {
    public static void main(String[] args) {
        CheckTheTriangle check= new CheckTheTriangle();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter edge a");
            int intputA = sc.nextInt();
            System.out.println("Enter edge b");
            int intputB = sc.nextInt();
            System.out.println("Enter edge c");
            int intputC = sc.nextInt();
            if(intputA<0|| intputB<0|| intputC<0){
                System.out.println("edge length must be greater than 0 ");
            } else if ( !(intputA + intputB > intputC) || intputA + intputC< intputB || intputB + intputC < intputA) {
                System.out.println("Not a triangle");
            }
            else {
                System.out.println("is a triangle");
            }
            check.checkTheTriangle(intputA,intputB,intputC);
        } catch (IllegalTriangleException e) {
            System.out.println("Not a triangle");
        }
    }
}