import java.util.Scanner;
public class JobExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int array []=new int[numbers];
        int sum=0;
        for (int i = 0 ; i<numbers; i++){
            array[i]=scan.nextInt();
            if (array[i]<0){
                sum=sum+array[i];
            }
        }
        System.out.println(Math.abs(sum));
    }
}
