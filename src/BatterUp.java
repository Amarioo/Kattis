import java.util.Scanner;
public class BatterUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum=0;
        int count=0;
      while (n-- >0){
          int k = scanner.nextInt();
          if (k!=-1) {
              count++;
              sum=sum+k;
          }
      }
       System.out.println(sum/count);
    }
}
