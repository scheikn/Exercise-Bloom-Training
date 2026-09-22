public class StudentUtils{

    static void printStudents (Student[] students) {
        for (Student tempstudent : students) {
           tempstudent.printInfo ();
        }
    }

}