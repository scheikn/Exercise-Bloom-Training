public class Product { 
   String name;
   double price; 
   int quantity;
   
    public Product (String name, double price, int quantity) { 
        this.name = name; 
        this.price = price;  
        this.quantity = quantity;
        }
    
    void introduce() {

        System.out.println(name);
        System.out.println(price);
        System.out.println(quantity);

        System.out.println(price*quantity);
        }
    }