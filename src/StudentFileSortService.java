import java.util.Comparator;
import java.util.List;

public class StudentFileSortService {

    public void sortStudentsByDescendingGrade(List<Student> students) {
        students.sort(Comparator.nullsLast(Comparator.comparing(Student::getGrade).reversed()));
    }
}
