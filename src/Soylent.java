import java.util.Scanner;

public class Soylent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hej = scan.nextInt();
        while (hej-- >0){
            System.out.println((int)Math.ceil(scan.nextInt()/400));
        }
    }
}
