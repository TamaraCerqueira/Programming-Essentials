public class Assign3Q6 {
    public static void main(String args[]) {
        int currentValue = 5;
        int x = 0;
        
        while (x < currentValue) {
            int y = 0;
            while (y < currentValue) {
                System.out.print("*");
                y++;
            }
            System.out.println();
            x++;
        }
        int a = 0;
        while (a < currentValue) {
            int b = 0;
            while (b <= a) {
                System.out.print("* ");
                b++;
            }
            System.out.println();
            a++;
        }
        int c = 0;
        while (c < currentValue) {
            int d = 0;
            while (d < 4 - c) {
                System.out.print(" ");
                d++;
            }
            int e = 0;
            while (e <= c) {
                System.out.print("*");
                e++;
            }
            System.out.println();
            c++;
        }
        int f = 0;
        while (f < currentValue) {
            int g = 0;
            while (g < currentValue - f) {
                System.out.print(" ");
                g++;
            }
            int h = 0;
            while (h < 2 * f + 1) {
                System.out.print("*");
                h++;
            }
            System.out.println();
            f++;
        }
        int m = 0;
        while (m <= currentValue) {
            int n = 0;
            while (n <= currentValue - m - 1) {
                System.out.print(" ");
                n++;
            }
            int o = 0;
            while (o < 2 * m + 1) {
                System.out.print(m);
                o++;
            }
            System.out.println();
            m++;
        }
        int p = 1;
        while (p <= currentValue) {
            int q = 1;
            while (q <= currentValue - p) {
                System.out.print(" ");
                q++;
            }
            int r = p;
            while (r >= 1) {
                System.out.print(r);
                r--;
            }
            int s = 2;
            while (s <= p) {
                System.out.print(s);
                s++;
            }
            System.out.println();
            p++;
        }
    }
}