public class StudentSortingService {
    // Before submission, need to utilize REGEX for course recognition

    // Method to group students by course
    public Student[] groupStudentsByCourse(Student[] students){
        int compsciIndex = 0;
        int apmthIndex = 0;
        int statIndex = 0;
        Student[] compsciStudents = new Student[students.length];
        Student[] apmthStudents = new Student[students.length];
        Student[] statStudents = new Student[students.length];
        for (Student student : students) {
            if ((student.getCourse() != null) && student.getCourse().contains("COMPSCI")) {
                compsciStudents[compsciIndex++] = student;
            } else if ((student.getCourse() != null) && student.getCourse().contains("APMTH")) {
                apmthStudents[apmthIndex++] = student;
            } else if ((student.getCourse() != null) && student.getCourse().contains("STAT")) {
                statStudents[statIndex++] = student;
            }
        }
        return compsciStudents;
    }
    // Method to sort students by grade in descending order
    public void sortStudentsByGrade(){}
}
