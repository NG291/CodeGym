import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public List<String> ReadFileText(String filePath) {
        List<String> arr= new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
            String line= "";
            while ((line= bufferedReader.readLine())!= null){
                   arr.add(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("The file does not exist or the content is corrupted!");
        }
        return arr;
    }
    public void WriteFileText(String filePath, List<String> arr){
        try {
            FileWriter fileWriter= new FileWriter(filePath);
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            for(String line: arr){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (Exception e)
        {
            System.err.println(" Not find file");
        }
    }

}
