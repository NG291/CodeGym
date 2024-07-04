import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Phân tích
//^ và $: Đây là các ký tự bắt đầu và kết thúc của chuỗi
//[0-1][0-9]: Giờ từ 00 đến 19.
//|: Toán tử OR, nghĩa là "hoặc".
//2[0-3]: Giờ từ 20 đến 23.
//:: Ký tự phân tách giữa giờ và phút.
//([0-5][0-9]): Đại diện cho phút, từ 00 đến 59.

public class Validate_Hour {
    private static Pattern pattern;

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^([0-1][0-9]|2[0-3]):[0-5][0-9]$");

        String text = "12:01";
        String text1 = "12:60";
        System.out.println("\nString " + text + " Available in hours and minutes format " + pattern.matcher(text).matches());
        System.out.println("\nString " + text1 + " Available in hours and minutes format " + pattern.matcher(text1).matches());

    }
}
