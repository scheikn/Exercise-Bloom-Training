import java.util.*;

public class Algorithms { 
    public static void main (String[] args) {
        ArrayList <String> names = new ArrayList <String> ();
        names.add ("Anna");
        names.add ("Tom");
        names.add ("Susi");
   
        ArrayList <Integer> numbers = new ArrayList <Integer> ();

        for (int i=1; i<11; i++) {
            numbers.add (i);
        }
        numbers.add (3);  
        numbers.add (3);  
        numbers.add (3);  


        System.out.println (numbers);
       
        Collections.sort (numbers, Collections.reverseOrder());
        System.out.println(numbers);

        System.out.println("max : "+ Collections.max(numbers));
        System.out.println("min : "+ Collections.min(numbers));

        Collections.shuffle (numbers); 
        System.out.println (numbers);
        Collections.shuffle (numbers); 
        System.out.println (numbers);
        Collections.shuffle (numbers); 
        System.out.println (numbers);
        Collections.sort (numbers); 
        System.out.println (numbers);

        System.out.println("Wie oft kommt 99 vor : "+ Collections.frequency(numbers, 99) + " mal");
        
        }
    }