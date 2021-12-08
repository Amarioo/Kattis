import java.util.Scanner;
public class DasBlinkenlights {
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
    public static int lcm(int a, int b) {
        return (a*b)/gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int q = scan.nextInt();
        int s= scan.nextInt();
        int a = p, b = q;
        if (lcm(a, b)<=s){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
