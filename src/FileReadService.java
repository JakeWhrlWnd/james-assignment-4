import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadService {
    // Before review, I want to switch to a List<Student>
    public String[] readFile(String filename) {
        String[] lines = new String[100];
        int index = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null && index < lines.length) {
                lines[index++] = line;
            }
        } catch (IOException e) {
            System.out.println("Oops, there was an issue reading your file. Issue -> " + e.getMessage());
        }
        return lines;
    }
}
