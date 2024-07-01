import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileText {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException("file not found");
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = " ";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.readLine();
            // Hiển thj ra màn hình tổng các ố nguyên trong file
            System.out.println("Tổng= "+ sum);
        } catch (Exception e) {
            // th file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông  báo  nỗi
            System.err.println("File không tồn tại or nội dung có lỗi!");
        }
    }
}
