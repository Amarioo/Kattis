import java.util.Scanner;

public class Rijeci {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int press = sc.nextInt();
            int A = 1;
            int B = 0;
            for (int i = 0; i < press; i++) {
                int temp = B;
                B = +A;
                A += temp;
            }
            System.out.println(A - B + " " + B);
        }
    }
}