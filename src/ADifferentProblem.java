import java.util.Scanner;
public class ADifferentProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            long a = scan.nextLong();
            long b = scan.nextLong();
            System.out.println(Math.abs(a-b));
        }while (scan.hasNextLong());

    }
}
