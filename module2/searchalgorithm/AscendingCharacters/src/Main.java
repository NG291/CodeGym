import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String str = sc.nextLine();
        String result=AscendingCharacters.RemoveDuplicateCharacters(str);
        System.out.println(AscendingCharacters.stringArrangement(result));
    }
}