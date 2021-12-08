import java.util.Arrays;
import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        while (scan.hasNextInt()) {
            counter++;
            int n = scan.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = scan.nextInt();
            }
            Arrays.sort(array);
            System.out.println("Case " + counter + ": " + array[0] + " " + array[array.length - 1] + " " + (array[array.length - 1] - array[0]));
        }
        scan.close();
    }
}
