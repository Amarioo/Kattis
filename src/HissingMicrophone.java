import java.util.Scanner;
public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char b;
        char temp = '-';
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            b=input.charAt(i);
            if (b==temp && b=='s') {
                counter++;
            }
            temp=b;
        }
        if (counter>0){
            System.out.println("hiss");
        }
        else {
            System.out.println("no hiss");
        }
    }
}
