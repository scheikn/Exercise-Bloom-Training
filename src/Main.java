public class Main { 
    public static void main (String[] args) {

        Student[]studentsA = {
            new Student ("Anna", 1), 
            new Student ("Paul", 3), 
            new Student ("Tim", 4), 
        };

        StudentUtils.printStudents (studentsA);

        double averageScore = StudentUtils.calAverageScore(studentsA);
        System.out.println(averageScore); 
      }
        
 }

