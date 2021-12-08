import java.util.Scanner;

public class ElectricalOutlets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum =0;
        while (n-- > 0){
            int n2 = scan.nextInt();
            for (int k = 0; k < n2; k++) {
                sum = sum + scan.nextInt();
            }
            System.out.println(sum-(n2-1));
            sum=0;
        }
    }
}
