import java.util.Scanner;
public class Pot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        long sum = 0;
        while (cases-- > 0) {
            int x = scan.nextInt();
            int pow = x % 10;
            int num = x / 10;
            sum += Math.pow(num, pow);
        }
        System.out.println(sum);
    }
}