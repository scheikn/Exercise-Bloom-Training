public class CountdownClass { 
      int startNumber;

    public CountdownClass (int number) { 
        this.startNumber = number;  
        }
        
void introduce() {
    for (int i = startNumber; i>=0; i --) {
        System.out.println (i);
    }
 System.out.println ("START!");
    }
 }
