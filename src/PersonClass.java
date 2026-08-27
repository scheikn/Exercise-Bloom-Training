public class PersonClass { 
   String name;
   int age; 
   
    public PersonClass (String name, int age) { 
        this.name = name; 
        this.age = age;  
        }

    
    void introduce() {

        System.out.println(name);
        
        if(age >= 65) {
            System.out.println("Senior");
        }
        else if(age >= 18) {
            System.out.println ("Adult");
        }
        else if(age >= 13) {
            System.out.println ("Teenager");
        }
        else if(age <= 13) {
            System.out.println ("Child");
        }
        else if(age < 0) {
            System.out.println ("Invalid");
        }
    
    }
}