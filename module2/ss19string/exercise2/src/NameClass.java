import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_REGEX = "^[A|C|P]+[0-9]{4}+[G|H|i|K]$";

    public NameClass() {
        this.pattern = Pattern.compile(CLASS_REGEX);
    }
    public boolean isValidate(String regex){
        matcher= pattern.matcher(regex);
        return matcher.matches();
    }
}
