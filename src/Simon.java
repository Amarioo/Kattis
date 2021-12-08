import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<String> list = new ArrayList();
        for (int i = 0; i < n + 1; i++) {
            String x = scan.nextLine();
            if (!x.isEmpty()) {
                list.add(x);
            }
        }
        for (String s : list) {
            if (s.contains("simon says")) {
                String[] words = s.split(" ");
                for (int k = 2; k < words.length; k++) {
                    System.out.print(words[k] + " ");
                }
                System.out.println();
            } else {
                System.out.println(" ");
            }
        }
    }
}
