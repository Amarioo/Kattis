import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char b ;
        for (int i = 0 ; i<input.length();i++) {
            b=input.charAt(i);
            if (Character.isUpperCase(b)) {
                System.out.print(b);
            }
        }
    }
}
