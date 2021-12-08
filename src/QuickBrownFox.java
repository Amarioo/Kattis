import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickBrownFox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0) {
            char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            List<Character> characterList = new ArrayList<>();
            List<Character> newArray = new ArrayList<>();
            for (char a : chars) {
                characterList.add(a);
            }
            String str = scanner.nextLine();
            if (str.isEmpty()){
                str= scanner.nextLine();
            }
            for (int i = 0; i < str.length(); i++) {
                char b = str.charAt(i);
                if (b == ' ') { }
                else if (!Character.isLetterOrDigit(b)) { }
                else if (Character.isLetter(b)) {
                    if (newArray.contains(b)) {
                    } else {
                        char toLowerCase = Character.toLowerCase(b);
                        newArray.add(toLowerCase);
                    }
                }
            }
            characterList.removeAll(newArray);
            if (characterList.isEmpty()) {
                System.out.println("pangram");
            } else {
                System.out.print("missing ");
                for (Character a : characterList) {
                    System.out.print(a);
                }
                System.out.println();
            }
            characterList.removeAll(characterList);
        }
    }
}
