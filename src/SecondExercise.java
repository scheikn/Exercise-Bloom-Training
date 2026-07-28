import java.util.Scanner;

public class SecondExercise {

    public static void main(String[] args) {
        double studentGPA = 1.45;
        String studentName = "Anton Zeppelin";
        String studentFirstName = "Anton";
        String studentLastName ="Zeppelin";
        char fristInitial = studentFirstName.charAt(0);
        char lastInitial = studentLastName.charAt(0);

        
        System.out.println(studentFirstName + studentLastName);
        System.out.println(studentFirstName + " " + studentLastName);
        System.out.println(studentFirstName + " " + studentLastName +"has a GPS of" + studentGPA);

        System.out.println("please enter new GPA");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentGPA);


    }
}