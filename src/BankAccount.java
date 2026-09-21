public class BankAccount { 
   String owner;
   double balance; 
   
   BankAccount(String owner, double balance) {
      this.owner = owner;
      this.balance = balance;
   }

   void introduce() {

        System.out.println(owner);

        if(balance == 0) {
            System.out.println ("empty");
            }

        else if(balance > 100) {
            System.out.println("good");
        }
        
        else if(balance < 100) {
            System.out.println("low");    
        }
    
        
    }
}