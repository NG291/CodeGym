public class ValidatePhoneTest {
    private static final String[] VALID_PHONE_NUMBER = new String[]{"84-0978489648", "12-0987657890"};
    private static final String[] INVALID_PHONE_NUMBER = new String[]{"8-9978489648", "12-09987657890"};

    public static void main(String[] args) {
        ValidatePhone validatePhone = new ValidatePhone();
        for (String phone : VALID_PHONE_NUMBER) {
            boolean isValid = validatePhone.isValidate(phone);
            System.out.println("Email is " + phone + " is valid: " + isValid);
        }
        for (String phone : INVALID_PHONE_NUMBER) {
            boolean isValid = validatePhone.isValidate(phone);
            System.out.println("Email is " + phone + " is valid: " + isValid);
        }
    }
}
