import java.util.Scanner;

public class TwoStones {
    private static void validator(int stone) {

        if (stone % 2 == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stones;
        stones = scan.nextInt();
        validator(stones);
    }
}
