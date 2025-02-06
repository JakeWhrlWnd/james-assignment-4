import java.util.Arrays;

public class StudentSortingApplication {

    public static void main(String[] args) {

        StudentFileReadService studentFileReadService = new StudentFileReadService();
        studentFileReadService.readStudents("src/student-master-list.csv");
        System.out.println(Arrays.toString(studentFileReadService.students));
    }
}
