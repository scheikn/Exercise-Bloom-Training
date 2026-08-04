public class HomeWork { 
    public static void main (String[] args) {
        int number = 110;

        if (number > 100) {
            System.out.println("invalid"); 
        }
        else if (number >= 90) {
            System.out.println("A");
        }
        else if (number >= 89) {
            System.out.println("B");  
        }
        else if (number >= 79) {
            System.out.println("C");  
        }
        else if (number >= 69) {
            System.out.println("D");  
        }
        else if (number < 60) {
            System.out.println("F"); 
        }
        
    }  
}
