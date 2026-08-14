public class Person { 
   String name;
   int age; 
   double height;
   boolean isAdult;  

    public Person (String name, int age, double height, boolean isAdult) { 
        this.name = name; 
        this.age = age; 
        this.height = height; 
        this.isAdult = isAdult;
    }

   void introduce() {
    System.out.println("Hello my name is "+ name);
    System.out.println("I am: "+ age + " years old");
    System.out.println("I am: "+ height + "m");
    if (isAdult) {
    System.out.println("isAdult is true");
    }
}
}