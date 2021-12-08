import java.util.Scanner;

public class Speedlimit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if (n == -1) {
                break;
            }
            int temp = 0, currentSpeed = 0;
            while (n-- > 0) {
                int x1 = scan.nextInt(), x2 = scan.nextInt();
                temp = x2-temp;
                currentSpeed = currentSpeed + (x1 * temp);
                temp = x2;
            }
            System.out.println(currentSpeed+" miles");
        }
        scan.close();
    }
}
