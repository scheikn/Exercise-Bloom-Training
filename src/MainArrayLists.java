import java.util.ArrayList;

public class MainArrayLists { 
    public static void main (String[] args) {

    ArrayList<Student> students = new ArrayList<Student> ();
    students.add (new Student ("Anna", 3));
    students.add (new Student ("Tom", 1));
    students.add (new Student ("Tim", 4)); 
    
    for (Student tempstudent : students) {
        tempstudent.printInfo ();
    }
}
}