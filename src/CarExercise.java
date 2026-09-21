public class CarExercise { 
   String model;
   int speed; 
   
   public CarExercise (String model, int speed) {
      this.model = model;
      this.speed = speed;
   }

   void speedClasses() {

        System.out.println(model);

        if(speed == 0) {
            System.out.println ("stopped");
            }

        else if(speed >= 120) {
            System.out.println("too fast");
        }
        
        else if(speed < 120 && speed >= 50 ) {
            System.out.println("normal");    
        }

        else if(speed <50) {
            System.out.println("slow");
        }
        
    }
}