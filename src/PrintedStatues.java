import java.util.Scanner;
public class PrintedStatues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println((int)Math.ceil(Math.log(input) / Math.log(2)+1));
    }
}
