public class SecondExercise {

    public static void main(String[] args) {
        int studentAge = 16;
        double studentGPA = 1.45;
        boolean perfectAttendence = true;
        String studentName = "Anton Zeppelin";
        String studentFirstName = "Anton";
        String studentLastName ="Zeppelin";
        char fristInitial = studentFirstName.charAt(0);
        char lastInitial = studentLastName.charAt(0);

        System.out.println(studentAge) ;
        System.out.println(studentGPA) ;
        System.out.println(fristInitial) ;
        System.out.println(lastInitial) ;
        System.out.println(perfectAttendence) ;
        System.out.println(studentName);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);
        System.out.println(studentFirstName + studentLastName);
        System.out.println(studentFirstName + " " + studentLastName);
        System.out.println(studentFirstName + " " + studentLastName +"has a GPS of" + studentGPA);


    }
}