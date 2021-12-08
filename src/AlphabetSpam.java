import java.util.Scanner;
public class AlphabetSpam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double upperC=0;
        double lowerC=0;
        double specialC=0;
        double whitespaceC=0;
        double wordC= 0;
        String input = scanner.nextLine();
        char b ;
        for (int i = 0 ; i<input.length();i++) {
            b=input.charAt(i);
            wordC++;
            if (Character.isLowerCase(b)) {
            lowerC++;
            }
            else if (Character.isUpperCase(b)){
                upperC++;
            }
            else if (b=='_'){
                whitespaceC++;
            }
            else if (!Character.isLetter(b)){
                specialC++;
            }
        }
        System.out.println(whitespaceC/wordC);
        System.out.println(lowerC/wordC);
        System.out.println(upperC/wordC);
        System.out.println(specialC/wordC);
    }
}
