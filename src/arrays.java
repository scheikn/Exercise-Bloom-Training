public class arrays { 
    public static void main (String[] args) {
        int[] scores = {7,8,9}; 

        System.out.println(scores[1]);
        System.out.println(scores.length);

        int i = 0;
        while (i < scores.length) {
            System.out.println(scores[i]);
            i++;
        }
    }
}