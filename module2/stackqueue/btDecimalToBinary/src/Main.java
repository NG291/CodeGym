import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luachon;

        do {
            System.out.println("Menu---------");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println("1: Chuyển đổi thập phân sang nhị phân");
            System.out.println("2: Chuyển đổi thập phân sang bát phân");
            System.out.println("3: Chuyển đổi thập phân sang thập lục phân");
            System.out.println("4: Chuyển đổi nhị phân sang thập phân");
            System.out.println("5: Chuyển đổi bát phân sang thập phân");
            System.out.println("6: Chuyển đổi thập lục phân sang thập phân");
            System.out.println("0: Thoát");
            luachon = sc.nextInt();

            switch (luachon) {
                case 1:
                    System.out.println("Nhập số thập phân: ");
                    int decimal1 = sc.nextInt();
                    System.out.println("Nhị phân: " + ConvertCounterSystem.convertBinary(decimal1));
                    break;

                case 2:
                    System.out.println("Nhập số thập phân: ");
                    int decimal2 = sc.nextInt();
                    System.out.println("Bát phân: " + ConvertCounterSystem.convertOctal(decimal2));
                    break;

                case 3:
                    System.out.println("Nhập số thập phân: ");
                    int decimal3 = sc.nextInt();
                    System.out.println("Thập lục phân: " + ConvertCounterSystem.convertHexadecimal(decimal3));
                    break;

                case 4:
                    System.out.println("Nhập số nhị phân: ");
                    String binary = sc.next();
                    System.out.println("Thập phân: " + ConvertCounterSystem.convertBinaryToDecimal(binary));
                    break;

                case 5:
                    System.out.println("Nhập số bát phân: ");
                    String octal = sc.next();
                    System.out.println("Thập phân: " + ConvertCounterSystem.convertOctalToDecimal(octal));
                    break;

                case 6:
                    System.out.println("Nhập số thập lục phân: ");
                    String hex = sc.next();
                    System.out.println("Thập phân: " + ConvertCounterSystem.convertHexadecimalToDecimal(hex));
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (luachon != 0);

        sc.close();
    }
}
