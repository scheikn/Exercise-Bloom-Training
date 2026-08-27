public class TemperatureClass { 
      int temperature;

    public TemperatureClass (int temperature) { 
        this.temperature = temperature;  
        }
        
void introduce() {
    System.out.println("Temperature is " + temperature + " °C");

        if(temperature >= 30) {
            System.out.println("hot");
        }
        else if(temperature >= 20) {
            System.out.println ("comfortable");
        }
        else if(temperature >= 0) {
            System.out.println ("cold");
        }
        else if(temperature < 0) {
            System.out.println ("freezing");
        }
    }
}
 