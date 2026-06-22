package MVCPatternExample;

import java.util.ArrayList;

public class StudentController {
    static ArrayList<Student> list=new ArrayList<>();
    public void add(Student a){
        list.add(a);
    }
    public void remove(Student a){
        list.remove(a);
    }
    public ArrayList<Student> getStudents(){
        return list;
    }
}
