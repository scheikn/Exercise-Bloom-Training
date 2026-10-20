import java.util.ArrayList;
import java.util.Iterator;

public class Iterators { 
    public static void main (String[] args) {
        ArrayList <String> names = new ArrayList <String> ();
        names.add ("Anna");
        names.add ("Tom");
        names.add ("Susi");

        Iterator <String> it = names.iterator (); 
      
        while (it.hasNext ()) {  
            System.out.println(it.next());
        }    

       it.remove (); 
    
    }
 }