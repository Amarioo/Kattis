import java.util.Arrays;
import java.util.Scanner;

public class Cetri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);

        int diff1 = array[1] - array[0];
        int diff2 = array[2] - array[1];
        if (diff1 == diff2) {
            System.out.println(array[2] + diff1);

        } else if (diff1 > diff2) {
            System.out.println(array[0] + diff2);

        } else {
            System.out.println(array[1] + diff1);
        }

    }
}
