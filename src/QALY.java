import java.util.Scanner;
public class QALY {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float sum = 0;
        int countofNums = scan.nextInt();
        while (countofNums-- >0){
            float n1 = scan.nextFloat();
            float n2=scan.nextFloat();
            sum=sum+(n1*n2);
        }
        System.out.println(sum);
    }
}
