import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;

public class FileWriteService {

    public <T> void writeFile(String fileName, List<T> data, String heading, Function<T, String> formatter) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            if (heading != null || !heading.isEmpty()) {
                bufferedWriter.write(heading);
                bufferedWriter.newLine();
            }
            for (T item : data) {
                bufferedWriter.write(formatter.apply(item));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Oops, there was an issue writing the file. Issue -> " + e.getMessage());
        }
    }
}
