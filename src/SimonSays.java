import java.util.Scanner;
public class SimonSays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
            scan.nextLine();
        while (n-- >0){
            String type = scan.nextLine();
            if (type.startsWith("Simon says"))
                System.out.println(type.substring(10));
        }
    }
}
