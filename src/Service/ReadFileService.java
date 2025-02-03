package Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFileService {

    public ArrayList<String> readFile(String filePath) {
        int index = 0;
        ArrayList<String> lines = new ArrayList<>();
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line + "\n");
            }
        } catch (IOException e) {
            System.out.println("Oops, there was an issue reading the file. Issue -> " + e.getMessage());
        }
        return lines;
    }
}
