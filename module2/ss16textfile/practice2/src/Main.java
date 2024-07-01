import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readWrite= new ReadAndWriteFile();
        List<Integer> numbers= readWrite.readfile("practice2/src/numbers.txt");
        int maxValue= readWrite.finMax(numbers);
        readWrite.writeFile("practice2/src/result.txt", maxValue);
    }
}