import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ivebeeneverywhereman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> mappen = new HashMap<String, Integer>();
        int t = scan.nextInt();
        while (t>0){
            int n = scan.nextInt();
            for (int i=0; i<n;i++){
                String s=scan.next();
                mappen.put(s,0 );
            }

            System.out.println(mappen.size());
            mappen.clear();
            --t;
        }
    }
}

