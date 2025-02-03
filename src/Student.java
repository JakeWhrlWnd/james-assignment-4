public class Student {

    private int studentID;
    private String studentName;
    private String studentCourse;
    private int studentGrade;

    public Student(int studentID, String studentName, String studentCourse, int studentGrade) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentCourse = studentCourse;
        this.studentGrade = studentGrade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    @Override
    public String toString() {
        return studentID + ", " + studentName + ", " + studentCourse + ", " + studentGrade + "\n";
    }
}
