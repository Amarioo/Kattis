import java.util.Scanner;

public class OddGnome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            int n2 = scan.nextInt();
            int[] array = new int[n2];
            for (int i = 0; i < n2; i++) {
                array[i] = scan.nextInt();
            }
            for (int j = 1; j < n2-1; j++) {
                if (!(array[j] - array[j-1] == 1) && !(array[j] - array[j+1] == -1)) {
                    System.out.println(j+1);
                }
            }
        }
    }
}
