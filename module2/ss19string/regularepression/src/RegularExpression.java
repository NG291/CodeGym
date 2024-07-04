import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        String text1 = "hello java regex 2-12-2018, hello world 12/12/2018";
        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
        Matcher matcher = pattern.matcher(text1);
        System.out.println("Ngay thang trong chuoi text1: " + text1);
        while (matcher.find()) {
            System.out.println(text1.substring(matcher.start(), matcher.end()));
        }
        String text2 = "2/12/2018";
        String text3 = "12/12/aaaa";
        pattern = Pattern.compile("^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$");
        System.out.println("\nChuoi "+ text2 + " Co dinh dang ngay thang: "+ pattern.matcher(text2).matches());
        System.out.println("Chuoi " + text3+ " Co dinh dang ngay thang: "+ pattern.matcher(text3).matches());
    }
}
