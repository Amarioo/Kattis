import java.util.Scanner;
public class NumberFun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        double x ,z, y;
        while (input-- >0){
            x=scan.nextDouble();
            y=scan.nextDouble();
            z=scan.nextDouble();
            if (x+y==z || x-y==z || y-x==z || x/y==z ||y/x==z|| x*y==z){
                System.out.println("Possible");
            }
            else System.out.println("Impossible");
        }
    }
}
