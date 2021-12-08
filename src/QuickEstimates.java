import java.util.Scanner;

public class QuickEstimates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] inputs = new String[N];
        for (int i = 0; i < N; i++) {
            inputs[i] = scanner.next();
            System.out.println(inputs[i].length());
        }

    }

}
