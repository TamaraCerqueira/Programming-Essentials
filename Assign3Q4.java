public class Assign3Q4 {
    public static void main(String args[]) {
        int currentValue = 5;

        for(int x = 0; x < currentValue; x++){
            for(int y = 0; y < currentValue; y++){
                System.out.print("*"); 
            }
            System.out.println();
        }

        for (int a = 0; a < currentValue; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int c = currentValue; c > 0; c--) {
            for (int d = 0; d < c; d++) {
            System.out.print("* ");
             }
            System.out.println();
        }
        
        for (int e = 0; e < currentValue; e++) {
            for (int f = 0; f < currentValue - e - 1; f++) {
                System.out.print(" ");
            }

  
            for (int j = 0; j < 2 * e + 1; j++) {
                System.out.print("*");
            }

            System.out.println(); 
        }
     
        for (int m = 0; m <= currentValue; m++) {
            for (int n = 0; n < currentValue - m - 1; n++) {
                System.out.print(" ");
            }

  
            for (int o = 0; o < 2 * m + 1; o++) {
                System.out.print(m);
            }

            System.out.println(); 
        }    
        for (int p = 1; p <= currentValue; p++) {
            for (int q = 1; q <= currentValue - p; q++) {
                System.out.print(" ");
            }

            for (int r = p; r >= 1; r--) {
                System.out.print(r);
            }
            for (int s = 2; s <= p; s++) {
                System.out.print(s);
            }

            System.out.println();
        }
    }
         
}  
