import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteService {

    static final String HEADING = "Student ID,Student Name,Course,Grade\n";

    public String[] writeFile(String fileName, String[] lines) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            bufferedWriter.write(HEADING);
            for (String line : lines) {
                bufferedWriter.write(line);
            }
        } catch (IOException e) {
            System.out.println("Oops, there was an issue writing the file. Issue -> " + e.getMessage());
        }
        return lines;
    }
}
