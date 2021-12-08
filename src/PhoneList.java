import java.util.Arrays;

public class PhoneList {
    public static void main(String[] args) {
        Kattio scan = new Kattio(System.in);
        int n = scan.getInt();

        while (n-- > 0) {
            int number = scan.getInt();
            String[] numberArray = new String[number];

            for (int i = 0; i < number; i++) {
                numberArray[i] = scan.getWord();
            }

            Arrays.sort(numberArray);

            boolean consistent = true;

            for (int i = 1; i < numberArray.length; i++) {
                if (numberArray[i].startsWith(numberArray[i - 1])) {
                    consistent = false;
                    break;
                }
            }

            if (consistent) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }
}