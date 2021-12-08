import java.util.Scanner;
public class Filip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inp = scan.nextInt();
        int inp2 = scan.nextInt();
        int reverse = 0;
        int reverse2 = 0;
        while (inp != 0) {
            reverse = reverse * 10;
            reverse = reverse + inp % 10;
            inp = inp / 10;
        }
        while (inp2 != 0) {
            reverse2 = reverse2 * 10;
            reverse2 = reverse2 + inp2 % 10;
            inp2 = inp2 / 10;
        }
        if (reverse>reverse2){
            System.out.println(reverse);
        }
        else {
            System.out.println(reverse2);
        }
    }
}
