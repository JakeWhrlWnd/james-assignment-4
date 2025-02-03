import Service.ReadFileService;

public class StudentSortingApplication {

    public static void main(String[] args) {
        ReadFileService readFileService = new ReadFileService();
        System.out.printf(String.valueOf(readFileService.readFile("student-master-list.csv")));
    }
}
