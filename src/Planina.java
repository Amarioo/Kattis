import java.util.Scanner;
public class Planina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println(((int) ((Math.sqrt(Math.pow(4, i)) +1)*(Math.sqrt(Math.pow(4, i)) +1))));
    }
}
