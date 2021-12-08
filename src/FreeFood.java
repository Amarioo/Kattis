import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FreeFood {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        while (n-- > 0) {
            int x1 = scan.nextInt();
            int x2 = scan.nextInt();
            for (int i = x1; i < x2 + 1; i++) {
                if (list.contains(i)) {
                    continue;
                } else {
                    list.add(i);
                }
            }
        }
        if (365 < list.size()){
            System.out.print("365");
        }
        else {
            System.out.print(list.size());
        }
    }
}
