import java.util.Scanner;
public class Apaxiaaaaaaaaaaaans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char b;
        char temp='-';
        for (int i = 0 ; i<input.length();i++) {
            b=input.charAt(i);
            if (b==temp) {
               continue;
            }
            else {
                System.out.print(b);
            }
            temp=b;
        }
    }
}
