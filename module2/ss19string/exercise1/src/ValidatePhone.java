import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private final Pattern pattern;
    private Matcher matcher;
    private static final String Phone_REGEX = "^[0-9]{2}(-)+(0)[0-9]{9}$";

    public ValidatePhone() {
        pattern = Pattern.compile(Phone_REGEX);
    }

    public boolean isValidate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

