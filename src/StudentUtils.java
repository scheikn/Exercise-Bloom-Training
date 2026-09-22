public class StudentUtils{

    static void printStudents (Student[] students) {
        for (Student tempstudent : students) {
           tempstudent.printInfo ();
        }
    }
    static double calAverageScore (Student[] students) {
        int sum = 0;
        for (Student tempstudent : students) {
            sum += tempstudent.score; 
        }
         return (double) sum / students.length;
    }
}