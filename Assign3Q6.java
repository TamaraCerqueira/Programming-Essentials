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
        int c = currentValue;
        while (c > 0) {
            int d = 0;
            while (d < c) {
                System.out.print("* ");
                d++;
            }
            System.out.println();
            c--;
        }
        int e = 0;
        while (e < currentValue) {
            int f = 0;
            while (f < currentValue - e - 1) {
                System.out.print(" ");
                f++;
            }
            int j = 0;
            while (j < 2 * e + 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            e++;
        }
        int m = 0;
        while (m <= currentValue) {
            int n = 0;
            while (n < currentValue - m - 1) {
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
  