import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TripleTexting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String s = br.readLine();
        int v = s.length()/3;
        String a = s.substring(0,v);
        String b = s.substring(v,v*2);
        String c = s.substring(2*v,3*v);
        if (a.equals(b)){
            System.out.println(a);
        }
        else if (a.equals(c)){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
}
