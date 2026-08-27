public class MultiplicationTable { 
      int number;

    public MultiplicationTable (int number) { 
        this.number = number;  
        }
        
    void introduce() {
     
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " " +  "x" + " " + i  + " " +"=" + " " + number * i);
        }
     }
 }