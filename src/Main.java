public class Main { 
    public static void main (String[] args) {

        Student[]students = {
            new Student ("Anna", 1), 
            new Student ("Paul", 3) 
            };

        int i = 0;
        while (i < students.length) { 
            Student student = students [i];

            student.printInfo();
            i++;
        }
      }
    }

