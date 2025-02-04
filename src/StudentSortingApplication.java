import com.assignment4.models.Student;
import com.assignment4.services.ReadFileService;
import com.assignment4.services.WriteFileService;

import java.util.List;

public class StudentSortingApplication {

    public static void main(String[] args) {

        ReadFileService readFileService = new ReadFileService();
        WriteFileService writeFileService = new WriteFileService();

        List<Student> lines = readFileService.readFile("student-master-list.csv");
//        writeFileService.writeFile("course.csv", lines);
    }
}
