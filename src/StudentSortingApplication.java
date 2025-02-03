import Service.ReadFileService;
import Service.WriteFileService;

public class StudentSortingApplication {

    public static void main(String[] args) {
        ReadFileService readFileService = new ReadFileService();
        WriteFileService writeFileService = new WriteFileService();
        System.out.printf(String.valueOf(readFileService.readFile("student-master-list.csv")));
    }
}
