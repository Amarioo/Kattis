import java.util.Scanner;

public class MethodicMultiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int counter1 = 0;

        String string = scan.nextLine();
        String string2 = scan.nextLine();
        char b;
        if (string.equals("0") || string2.equals("0")) {
            System.out.println("0");
        } else {
            for (int i = 0; i < string.length(); i++) {
                b = string.charAt(i);
                if (b == 'S') {
                    counter++;
                }
            }
            for (int i = 0; i < string2.length(); i++) {
                b = string2.charAt(i);
                if (b == 'S') {
                    counter1++;
                }
            }
            int sum = counter * counter1;
            for (int i = 0; i < sum; i++) {
                System.out.print("S(");
            }
            System.out.print("0");
            for (int i = 0; i < sum; i++) {
                System.out.print(")");
            }
        }
    }
}
