import java.util.Scanner;

public class SoftPasswords {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String stringInput1 = scanner.next();
        String stringInput2 = scanner.next();
        String opp = "";
        if (stringInput1.equals(stringInput2)) {
            System.out.println("Yes");

        } else {
            char last = stringInput1.charAt(stringInput1.length() - 1);
            char first = stringInput1.charAt(0);
            for (int i = 0; i < stringInput1.length(); i++) {
                char b = stringInput1.charAt(i);

                if (Character.isLetter(b)) {
                    if (Character.isUpperCase(b)) {

                        opp += Character.toLowerCase(b);
                    } else {
                        opp += Character.toUpperCase(b);
                    }
                } else {
                    opp += b;
                }
            }

            if (opp.equals(stringInput2)) {
                System.out.println("Yes");
            } else {
                String a = first + stringInput2;
                String b = stringInput2 + last;
                if (a.equals(stringInput1) && Character.isDigit(first))
                    System.out.println("Yes");
                else if (b.equals(stringInput1) && Character.isDigit(last))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }

        }
    }
}
