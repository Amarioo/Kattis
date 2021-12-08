import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Integer> list = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i<n; i++){
           list.add(scanner.nextInt());
        }
        Collections.reverse(list);
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
