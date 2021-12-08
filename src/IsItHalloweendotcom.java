import java.util.Scanner;
public class IsItHalloweendotcom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<1; i++){
          String input = scanner.nextLine();
            if (input.equalsIgnoreCase("OCT 31") ||input.equalsIgnoreCase("DEC 25") ){
                System.out.print("yup");
            }
            else System.out.print("nope");
        }
    }
}
