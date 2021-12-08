import java.util.Scanner;
public class RoamingRomans {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(Math.round(Double.parseDouble(input) * 1000 * 5280 / 4854));
    }
}