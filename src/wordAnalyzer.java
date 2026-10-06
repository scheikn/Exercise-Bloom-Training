public class wordAnalyzer { 
    public static void main (String[] args) {
        
        String sentence = ("Java is fun and Java is usefull");
        String[] words = sentence.split ("Java");

        for(String word : words) {
            System.out.println(word);
        }
    }
 } 