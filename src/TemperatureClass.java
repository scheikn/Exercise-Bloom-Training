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

    void reducedTemperature() {
        System.out.println("Starting Temperature is " + temperature + " °C");

        if (temperature >=0) {
            
            while (temperature>=0) {
                
                if(temperature >= 30) {
                        System.out.println(temperature + " means hot");
                    }
                else if(temperature >= 20 && temperature <30) {
                        System.out.println (temperature + " means comfortable");
                    }
                 else if(temperature >= 0 && temperature<20) {
                        System.out.println (temperature + " means cold");
                      }
                 temperature --; 
             }
                
        }
        if (temperature <0) {
                    
             while (temperature<0) {
                System.out.println (temperature + " means freezing");
                temperature ++; 
                }
             }
                        
         }

}
    


 