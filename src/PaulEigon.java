import java.util.Scanner;

public class PaulEigon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int turns = scan.nextInt() + scan.nextInt();
        if (turns/n % 2==0 ){
            System.out.println("paul");
        }
        else {
            System.out.println("opponent");
        }
    }
}
