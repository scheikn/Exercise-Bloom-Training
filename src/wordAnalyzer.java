import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map; 
import java.util.HashMap; 

public class wordAnalyzer { 
    public static void main (String[] args) {
        
        String sentence = ("Java is fun and Java is usefull");
        String[] words = sentence.split (" ");

       /* for(String word : words) {
            System.out.println(word);
        } */

        ArrayList<String> wordlist = new ArrayList <String> ();
        HashSet<String> uniqueWords = new HashSet <String> ();
        HashMap<String, Integer> wordCount = new HashMap <String, Integer> ();

        for(String word : words) {
            wordlist.add (word);
            uniqueWords.add (word);
            if (wordCount.containsKey(word)){
                int currentCount = wordCount.get(word);
                wordCount.put(word, currentCount + 1); 
            }
            else {
                wordCount.put(word, 1);
            }
        }

        System.out.println(wordlist);
        System.out.println("all unique words are: " + uniqueWords);
        System.out.println(wordCount);
    }
 } 