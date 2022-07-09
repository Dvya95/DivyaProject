public class Student {

    private int rolNo;
    private String name;
    private int marks;

    public Student(int rolNo, String name,int marks){
        this.rolNo=rolNo;
        this.name=name;
        this.marks=marks;
    }

    public int getRolNo() {
        return rolNo;
    }

    public void setRolNo(int rolNo) {
        this.rolNo = rolNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
