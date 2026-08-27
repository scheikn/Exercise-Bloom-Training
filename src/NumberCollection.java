public class NumberCollection { 
      int sum;

    public NumberCollection (int sum) { 
        this.sum = sum;  
        }

    void introduce() {

    System.out.println("Number is " + sum);

    int i = 1; 
    while (i<=20) {
        int number = sum+=i;

    if (number %2 ==0) { 
        System.out.println(number + " ist gerade");
    }
    i++;
    }
    System.out.println(sum);
    }
}