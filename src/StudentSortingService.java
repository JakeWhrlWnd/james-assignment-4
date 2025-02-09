import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentSortingService {
    // Before submission, need to utilize REGEX for course recognition

    public Map<String, List<Student>> groupStudentsByCourse(Student[] students){
        Map<String, List<Student>> studentsByCourse = new HashMap<>();

        for (Student student : students) {
            String course = student.getCourse();

            if (course == null) {
                continue;
            }

            if (studentsByCourse.containsKey(course)) {
                studentsByCourse.get(course).add(student);
            } else {
                List<Student> studentList = new ArrayList<>();
                studentList.add(student);
                studentsByCourse.put(course, studentList);
            }
        }
        return studentsByCourse;
    }
    // Method to sort students by grade in descending order
    public void sortStudentsByGrade(){}
}
