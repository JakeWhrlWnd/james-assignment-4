public class StudentFileReadService {
    // Before review, I want to switch to a List<Student>
    public Student[] students = new Student[100];

    private final FileReadService fileReadService = new FileReadService();

    public void readStudents(String filename) {
        String[] lines = fileReadService.readFile(filename);
        int index = 0;
        for (String line : lines ) {
            if (line != null && index < lines.length) {
                String[] fields = line.split(",");
                if (fields.length == 4) {
                    students[index++] = new Student(Integer.parseInt(fields[0]), fields[1], fields[2], Integer.parseInt(fields[3]));
                }
            }
        }
    }
}
