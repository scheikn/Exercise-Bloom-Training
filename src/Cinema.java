public class Cinema { 
   int availableSeats; 
   
   public Cinema (int availableSeats) {
      this.availableSeats = availableSeats;
        }

   void sellSeat() {

    int[] tickets = new int[150];

        int i = 0;
        while (availableSeats > 0 && i < tickets.length) {
            availableSeats--;
            i++;
            
            System.out.println( tickets.length + "Ticket verkauft.");
        }
    }
}