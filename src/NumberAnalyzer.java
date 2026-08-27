public class NumberAnalyzer { 
      int number;

    public NumberAnalyzer (int number) { 
        this.number = number;  
        }
        
void introduce() {

        System.out.println("Number is " + number);

        if(number > 0) {
            System.out.println("positiv");
        }
        else if(number < 0) {
            System.out.println ("negative");
        }
        else {
            System.out.println ("zero");
        }
        if(number % 2 == 0) {
            System.out.println("gerade");
        }
        else if(number % 2 != 0) {
            System.out.println ("ungerade");
        }
      }
 }