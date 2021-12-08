import java.io.*;
import java.util.Scanner;

public class ChanukahChallenge {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(sc.readLine());
        while (cases-- > 0) {
            String[] tokens = sc.readLine().split(" ");
            int n = Integer.parseInt(tokens[1]);
            System.out.println(tokens[0] + " " + (n * (n + 1) / 2 + n));
        }
        }
    }

