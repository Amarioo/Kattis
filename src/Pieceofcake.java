import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pieceofcake {
    public static void main(String[] args) throws Exception{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int h=Integer.parseInt(st.nextToken());
        int v=Integer.parseInt(st.nextToken());
        System.out.println(Math.max(h, n-h)*Math.max(v, n-v)*4);
        //Math.max(h, n-h)*Math.max(v, n-v)*4
    }
}
