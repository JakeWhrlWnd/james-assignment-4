import java.util.ArrayList;
import java.util.List;

public class StudentFileWriteService {

    private final FileWriteService fileWriteService = new FileWriteService();
    static final String HEADING = "Student ID,Student Name,Course,Grade";

    public void writeStudents(String filename, List<Student> students) {
        List<String> lines = new ArrayList<>();
        lines.add(HEADING);
        for (Student student : students) {
            if (student != null) {
                lines.add(student.toString());
            }
        }
        fileWriteService.writeFile(filename, lines);
    }
}
