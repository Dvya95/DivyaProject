import java.util.ArrayList;

public class StudentRepository {
    ArrayList<Student> getStudentData() {
        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student(1, "divya", 50);
        Student student2 = new Student(2, "danas", 60);
        Student student3 = new Student(3, "senior", 70);
        Student student4 = new Student(4, "diamon", 80);
        list.add(student);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        return list;
    }
}
