public class Assign3Q5 {
    public static void main(String args[]) {

        int currentValue = 5; 
        long factorialNumber = 1; 
        int beta = 1; 
       
        while (beta <= currentValue) {
            factorialNumber *= beta;
            beta++;
        }
        System.out.println("The Number " + currentValue + " is: " + factorialNumber);

    }
}