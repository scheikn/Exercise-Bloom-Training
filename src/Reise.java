public class Reise { 
   String ziel;
   int dauer; 
   
   Reise(String ziel, int dauer) {
      this.ziel = ziel;
      this.dauer = dauer;
   }
   void printInfo () {
      System.out.println(ziel);
      System.out.println(dauer);
      System.out.println("Reise nach "+ ziel + " :" + dauer);
   }

   
   }