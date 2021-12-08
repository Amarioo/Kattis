import java.util.Scanner;

public class MixedFractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        while (!line[0].equals("0")) {
            System.out.printf(
                    "%d %d / %d%n", Integer.parseInt(line[0]) / Integer.parseInt(line[1]),
                    Integer.parseInt(line[0]) % Integer.parseInt(line[1]), Integer.parseInt(line[1])
            );
            line = sc.nextLine().split(" ");
        }
    }
}
