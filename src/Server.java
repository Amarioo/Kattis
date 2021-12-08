import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int time = scan.nextInt();
        int temptime = 0;
        int counter = 0;
        while (n-- > 0) {
            int temp = scan.nextInt();
            temptime = temptime + temp;
            if (temptime > time) {
                break;
            } else {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
