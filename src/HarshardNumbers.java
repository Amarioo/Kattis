import java.util.Scanner;

public class HarshardNumbers {
    private static boolean hars(int i){
        int x = i;
        int s = 0;
        while(i > 9){
            s += i % 10;
            i /= 10;
        }
        s += i;

        return x % s == 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        while (!hars(n)) n++;

        System.out.println(n);
    }
}
