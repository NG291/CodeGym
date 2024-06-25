import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class AscendingCharacters {
    public String str;

    public  static String stringArrangement(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    public static  String RemoveDuplicateCharacters(String str){
        LinkedHashSet<Character> set= new LinkedHashSet<>();
        for(char chars: str.toCharArray()){
            set.add(chars);
        }
        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }
        return result.toString();

    }


}
