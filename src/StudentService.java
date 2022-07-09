import java.util.ArrayList;

public class StudentService {
    ArrayList<Student> getStudentdata(){
        StudentRepository student = new StudentRepository();
        return student.getStudentData();
    }
}
