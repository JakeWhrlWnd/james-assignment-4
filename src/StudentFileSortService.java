import java.util.Comparator;
import java.util.List;

public class StudentFileSortService {

    private final FileSortService fileSortService = new FileSortService();

    public void sortStudentsByDescendingGrade(List<Student> students) {
        fileSortService.sort(students, Comparator.nullsLast(Comparator.comparing(Student::getGrade).reversed()));
    }
}
