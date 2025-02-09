import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReadService {

    public List<String> readFile(String filename) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Oops, there was an issue reading your file. Issue -> " + e.getMessage());
        }
        return lines;
    }
}
