import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Egypt {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int b;
        int c;
        while (true) {
            // a b c är 3 på rad, parsar så man slipper att loopa igenom alla och ta ut index
            String[] line = sc.readLine().split(" ");
            a = Integer.parseInt(line[0]);
            b = Integer.parseInt(line[1]);
            c = Integer.parseInt(line[2]);
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            if(a>b){
                int temp = a;
                a=b;
                b=temp;
            }

            if(b>c){
                int temp = b;
                b=c;
                c=temp;
            }

            System.out.println(c*c==a*a+b*b?"right":"wrong");
        }
    }
}
