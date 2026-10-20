import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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

        ListIterator <String> Listit = names.listIterator (names.size()-1); 
        Listit.previous(); 
        
        Listit.remove ();
        System.out.println(names);
        } 
        
    }
 