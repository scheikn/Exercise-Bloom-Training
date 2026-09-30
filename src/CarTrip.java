public class CarTrip {
   String destination;
   int fuel; 

    CarTrip(String destination, int fuel) {
      this.destination = destination;
      this.fuel = fuel;
    }

    void fuelcalc() {

    System.out.println("for the trip to : " + destination);

      int i = fuel;
        while (i >= 0) {
        
        if( i == 0) {
            System.out.println ("kein kraftstoff");
        }

        else if(i > 30) {
            System.out.println("genug kraftstoff");
        }
        
        else if(i <= 30) {
            System.out.println("kraftstoff wird knapp");    
        }
        i -= 10;
    }
}
}