import java.util.*;

public class NoDuplicates {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        ArrayList<String> line= new ArrayList<String>();
        Set<String> s = new HashSet<String>();

        while(sn.hasNext()) {
            line.add(sn.next());
        }

        for (String a : line) {
            s.add(a);
        }
        if(line.size() != s.size()) {
            System.out.println("no");
        }else{
            System.out.println("yes");
        }
    }
}
