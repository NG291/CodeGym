import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ParseCsvLine {
    public List<Country> ReadFileCountry(String filePath) {
        List<Country> list = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                List<String> fileds = splitCsvLine(line);
                if (!fileds.isEmpty()) {
                  String id=fileds.get(0);
                  String code=fileds.get(1).replace("\""," ");
                  String name=fileds.get(2).replace("\""," ");
                    Country country= new Country(id,code, name);
                    list.add(country);
                }
            }
            bufferedReader.close();
        } catch (Exception e) {

            System.err.println("Lỗi!");
        }
        return list;
    }
    public static List<String> splitCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] fields = csvLine.split(",");
            for (String field : fields) {
                result.add(field.trim());
            }
        }
        return result;
    }
}
