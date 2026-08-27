public class StudentGrades { 
   String name;
   int score; 
   
    public StudentGrades (String name, int score) { 
        this.name = name; 
        this.score = score;  
        }
void introduce() {

        System.out.println(name);

        if(score > 100) {
            System.out.println("invalid");
        }
        else if(score >= 90) {
            System.out.println("A");
            System.out.println ("passed");
        }
        else if(score >= 80) {
            System.out.println ("B");
            System.out.println ("passed");
        }
        else if(score >= 70) {
            System.out.println ("C");
            System.out.println ("passed");
        }
        else if(score >= 60) {
            System.out.println ("D");
            System.out.println ("passed");
        }
        else if(score < 60) {
            System.out.println ("F");
            System.out.println ("failed");
        }
    
    }
}