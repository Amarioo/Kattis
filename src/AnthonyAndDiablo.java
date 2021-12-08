import java.util.Scanner;

public class AnthonyAndDiablo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input1 = scan.nextDouble();
        double input2 = scan.nextDouble();
        double area = (input2 * input2) / (4 * Math.PI);
        if (area >= input1) {
            System.out.println("Diablo is happy!");
        } else {
            System.out.println("Need more materials!");
        }
    }
}
