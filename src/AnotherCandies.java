import java.util.Scanner;

public class AnotherCandies {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();

        while (n-- > 0) {
            int children = scan.nextInt();

            long sum = 0;
            for (int i = 0; i < children; ++i) {
                Long candies = Long.parseUnsignedLong(scan.next());
                sum += candies % children;
            }

            String result = (sum % children == 0) ? "YES" : "NO";
            System.out.println(result);
        }
    }
}
