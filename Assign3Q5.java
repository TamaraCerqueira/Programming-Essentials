public class Assign3Q3 {
    public static void main(String args[]) {
        int currentValue = 5; 
        int gama = 1; 
        int beta = 1; 
        while (beta <= currentValue) {
            gama *= beta;
            beta++;
            
            System.out.println("The number " + currentValue + " is: " + gama);
        
        }
        
    }
}