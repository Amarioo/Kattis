import java.util.Scanner;
public class GrassSeedInc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double multValue = scan.nextDouble();
        int n = scan.nextInt();
        double sum =0;
        while (n-- >0){
            double n1 = scan.nextDouble();
            double n2 = scan.nextDouble();
            sum=sum+(n1*n2);
        }
        System.out.println(sum*multValue);
    }
}
