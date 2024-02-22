public class Assign3Q3 {
    public static void main(String args[]) {
        int currentValue = 5; 
        int gama = 1; 
        for (int beta = 1; beta <= currentValue; beta++) {
            gama *= beta;
        }
        System.out.println("The number " + currentValue + " is: " + gama);
    }
}