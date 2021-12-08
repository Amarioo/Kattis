import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OddManOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int k = 0; k<n; k++){
            Set<Integer> list = new HashSet<>();
            int g = scan.nextInt();
            for (int i = 0; i < g; i++) {
                int temp = scan.nextInt();
                if (list.contains(temp)) {
                    list.remove(temp);
                } else {
                    list.add(temp);
                }
            }
            System.out.println("Case #"+(k+1)+ ": "+(list.toArray())[0]);
        }
    }
}
