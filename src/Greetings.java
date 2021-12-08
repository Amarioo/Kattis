import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char b;
        System.out.print("h");
        for (int i = 0; i < input.length(); i++) {
            b = input.charAt(i);
            if (b == 'e') {
                System.out.print("ee");
            }
        }
        System.out.print("y");
    }
}
