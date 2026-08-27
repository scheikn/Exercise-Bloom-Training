public class Main { 
    public static void main (String[] args) {

        Product productA = new Product ("pen",3.25,6);     
        productA.introduce (); 
  
        Product productB = new Product ("calculator",10.99,2);     
        productB.introduce (); 

        Product productC = new Product ("paper",0.50,50);     
        productC.introduce (); 

        double totalPrice = productA.price*productA.quantity + productB.price*productB.quantity  + productC.price*productC.quantity ;

        System.out.println("The total price is : " + totalPrice);
       }
}
