import javax.xml.crypto.dsig.spec.XPathType;
import java.util.regex.Pattern;

//Phân tích
//^ và $: Đây là các ký tự bắt đầu và kết thúc của chuỗi
//[0-9]{4}: Một nhóm gồm 4 chữ số (từ 0 đến 9).
//[-| ]: Là ký tự phân tách, có thể là dấu gạch ngang (-) hoặc dấu cách ( ).
public class ValidateCreditCard {
    private static Pattern pattern;

    public static void main(String[] args) {
        pattern = Pattern.compile("^([0-9]{4}[-| ]){3}[0-9]{4}$");
        String text = "0000-3455-3453-2123";
        String text1 = "1234-4d67-7891-1234";
        System.out.println("\nString " + text + " Credit card format " + pattern.matcher(text).matches());
        System.out.println("\nString " + text1 + "Credit card format " + pattern.matcher(text1).matches());
    }
}
