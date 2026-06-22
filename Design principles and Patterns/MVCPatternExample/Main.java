package MVCPatternExample;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student.Builder().setId(1).setName("A").setGrade('A').build();
        Student s2=new Student.Builder().setId(2).setName("B").setGrade('B').build();
        StudentController sc=new StudentController();
        StudentView sv=new StudentView();
        sc.add(s2);
        sc.add(s1);
        sv.displayStudentDetails();
    }
}
