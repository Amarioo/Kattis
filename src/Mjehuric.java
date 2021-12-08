import java.util.Scanner;

public class Mjehuric {
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    for (int value : arr) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};
        bubbleSort(arr);
    }
}
