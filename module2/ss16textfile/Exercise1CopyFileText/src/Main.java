import java.util.List;

public class Main {
    public static void main(String[] args) {
        CopyFileText cp= new CopyFileText();
        List<String> arr= cp.ReadFileText("Exercise1CopyFileText/src/source.txt");
        for (String line: arr){
            System.out.println(line);
        }
       cp.WriteFileText("Exercise1CopyFileText/src/target.txt",arr);
    }
}
