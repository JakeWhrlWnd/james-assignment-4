import java.util.List;

public class StudentFileWriteService {

    private final FileWriteService fileWriteService = new FileWriteService();
    private static final String HEADING = "Student ID,Student Name,Course,Grade";

    public void writeStudents(String filename, List<Student> students) {
        fileWriteService.writeFile(filename, students, HEADING, Student::toString);
    }


}
