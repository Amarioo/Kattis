import java.util.Scanner;

public class Basketball1on1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char b;
        int Asum = 0;
        int Bsum = 0;
        for (int i = 0; i < input.length(); i++) {
            b = input.charAt(i);
            if (b == 'A') {
                Asum = Asum + Character.getNumericValue(input.charAt(i + 1));
            } else if (b == 'B') {
                Bsum = Bsum + Character.getNumericValue(input.charAt(i + 1));
            }
        }
        if (Asum > Bsum) {
            System.out.print("A");
        } else if (Asum < Bsum) {
            System.out.println("B");
        }
    }
}