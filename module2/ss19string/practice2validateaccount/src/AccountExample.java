import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private Pattern pattern;
    private Matcher matcher;
    public static final String Account = "^[_a-z0-9]{6,}$";

    public AccountExample() {
        this.pattern = Pattern.compile(Account);
    }
    public  boolean validate(String regex){
        matcher= pattern.matcher(regex);
        return matcher.matches();
    }
}