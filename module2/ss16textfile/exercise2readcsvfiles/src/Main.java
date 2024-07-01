import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
public static void main(String[] args) {
    String filePath = "exercise2readcsvfiles/source/data.txt";
    ParseCsvLine cp= new ParseCsvLine();
    List<Country> countries = cp.ReadFileCountry(filePath);
    for (Country country : countries) {
        System.out.println(country);
    }
}
}
