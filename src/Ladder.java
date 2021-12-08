import java.util.Scanner;
public class Ladder {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double hej = scanner.nextDouble();
        double hej2= scanner.nextInt();
        double angleR = Math.toRadians(hej2);
        int shortestLength = (int) Math.ceil(hej / Math.sin(angleR));
        System.out.println(shortestLength);
    }}
