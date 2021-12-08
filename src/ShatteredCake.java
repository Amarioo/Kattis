import java.util.Scanner;

public class ShatteredCake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        int n = scan.nextInt();
        int area = 0;
        while (n-- > 0) {
            area =  area + (scan.nextInt() * scan.nextInt());
        }
        System.out.println(area / width);
        scan.close();
    }
}
