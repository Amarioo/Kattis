import java.util.Scanner;
// Kikade lite på hur en annan gjorde på denna, förstog ej matteformeln
public class Crne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long b = a/2;
        long c = b;

        if(b+c < a) {
            b++;
        }

        long ans = (b+1) * (c+1);
        System.out.println(ans);

    }
}
