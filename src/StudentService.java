import java.util.ArrayList;
import java.util.Map;

public class StudentService {
    StudentRepository student = new StudentRepository();
    ArrayList<Student> getStudentdata(){
        return student.getStudentData();
    }
   void convertToMapFromList(ArrayList<Student> studentArrayList){
        student.prepareMapFromList(studentArrayList);
    }
}
