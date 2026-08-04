public class HomeWork { 
    public static void main (String[] args) {
        int strom= 100;
             
        if (strom >= 300) {
            System.out.println("Hoher Verbrauch");
        }
        else if (strom >= 100 && strom <= 299) {
            System.out.println("Normaler Verbrauch");
        }
        else if (strom <= 99) {
            System.out.println("Niedriger Verbrauch");
         }    
        else {
            System.out.println("invalid");
        }
    }
    }