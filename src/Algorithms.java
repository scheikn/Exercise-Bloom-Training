import java.util.*;

public class Algorithms { 
    public static void main (String[] args) {
        ArrayList <String> names = new ArrayList <String> ();
        names.add ("Anna");
        names.add ("Tom");
        names.add ("Susi");

        Collections.sort(names); 
        System.out.println (names);
       
        int index = Collections.binarySearch (names, "Susi");
        System.out.println ( "Susi is at position : " + (index +1));

        }
    }