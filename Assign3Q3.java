public class Assign3Q3 {
    public static void main(String args[]) {
        int currentValue = 5; 
        long factorialNumber = 1; 
        for (int beta = 1; beta <= currentValue; beta++) {
            factorialNumber *= beta;
        }
        System.out.println("The number " + currentValue + " is: " + factorialNumber);
    }
}