import java.util.regex.Pattern;

//Phân tích

//[0-9],[1,2] tức là ngày hoặc tháng có giá trị từ 1- 31, 1-2.
//[-| ] là ký tự phân tích, có thể là dấu gạch ngang (-)hoặc dâu cách (/).
//  [0-9] {4} đại diện cho bố chữ của năm
public class Validate_Date {
    private  static Pattern pattern;
    public static void main(String[] args) {
        String text1 = "2/12/2018";
        String text2 = "12/12/aaaa";

        pattern = Pattern.compile("^([0]?[1-9]|[1-2]?[0-9]|3[01])[-/]([0]?[1-9]|1[0-2])[-/]\\d{4}$");

        System.out.println("\nString " + text1 + " Date format: " + pattern.matcher(text1).matches());

        System.out.println("String " + text2 + " Date format: " + pattern.matcher(text2).matches());
    }
}
