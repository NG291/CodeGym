import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int countAdmin = 0;
        int countUse = 0;
        List<Use> list = new ArrayList<>();
        list.add(new Use("john@gmail.com", "john", ReleConst.ROLE_USE));
        list.add(new Use("my@gmail.com", "my", ReleConst.ROLE_ADMIN));
        list.add(new Use("hello@gmail.com", "hello", ReleConst.ROLE_USE));
        // in ra so luong use
        for ( Use use: list) {
            if (ReleConst.ROLE_ADMIN == use.getRole()) {
                countAdmin++;
            } else {
                countUse++;
            }
            //Tim email
            if (use.getEmail().equals("john@gmail.com")) {
                System.out.println(use + "co trong danh sach");
            }
            //Tim ten
            if (use.getName().equals("hello")) {
                System.out.println(use + "Co trong danh sach");
            }
        }
        System.out.println("So luong Admin trong danh sach: "+countAdmin);
        System.out.println("So luong Use trong danh sach: "+ countUse);
    }
}
