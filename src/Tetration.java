import java.util.Scanner;

public class Tetration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double input = scan.nextDouble();
        System.out.printf("%.6f", Math.pow(input, 1 / input));
        scan.close();
    }
}
