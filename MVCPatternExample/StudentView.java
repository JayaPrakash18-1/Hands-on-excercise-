package MVCPatternExample;
import java.util.ArrayList;

public class StudentView {
    StudentController sc=new StudentController();
    public void displayStudentDetails(){
        ArrayList<Student> list=sc.getStudents();
        for(Student i:list){
            System.out.println(i);
        }
    }
}
