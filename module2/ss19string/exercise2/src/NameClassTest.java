import javafx.scene.chart.ValueAxis;

public class NameClassTest {
    private static final String[] VALID_NAME_CLASS = new String[]{" C0223G", "A0323K"};
    private static final String[] INVALID_NAME_CLASS = new String[]{" M0318G", "P0323A"};

    public static void main(String[] args) {
        NameClass nameClass = new NameClass();
        for (String name : VALID_NAME_CLASS) {
            boolean isValid = nameClass.isValidate(name);
            System.out.println("nameClass " + name + " isvalid " + isValid);
        }
        for (String name : INVALID_NAME_CLASS) {
            boolean isValid = nameClass.isValidate(name);
            System.out.println("nameClass " + name + " isvalid " + isValid);
        }

    }
}
