import java.util.Scanner;
public class Oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x ;
        for (int i = 0; i<n; i++){
            x=sc.nextInt();
            if (x % 2 == 0)
                System.out.println(x + " is even");
            else
                System.out.println(x + " is odd");
        }
    }
}

