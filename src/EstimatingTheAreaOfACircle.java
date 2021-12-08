import java.util.Scanner;

public class EstimatingTheAreaOfACircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextInt();
        int int1 = scanner.nextInt();
        while(x1 != 0) {
            System.out.println(Math.PI * x1 * x1 + " " + (2 * x1 * (2 * x1) * (int1 / x2)));
            x1 = scanner.nextDouble();
            x2 = scanner.nextInt();
            int1 = scanner.nextInt();
        }
    }
}
