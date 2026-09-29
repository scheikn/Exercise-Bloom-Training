import java.util.HashMap;
import java.util.Map;

public class MapsStudent { 
    public static void main (String[] args) {

        Map<Integer, String> scores = new HashMap<> ();
        scores.put (5, "Susi");
        scores.put (1, "Pete");
        

        System.out.println(scores.get (5));
    

            }
        }