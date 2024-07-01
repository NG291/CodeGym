import javax.security.sasl.SaslClient;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file:");
        Scanner sc= new Scanner(System.in);
        String path= sc.nextLine();
        ReadFileText readFileText= new ReadFileText();
        readFileText.readFileText(path);
    }
}