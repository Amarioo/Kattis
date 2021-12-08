import java.math.BigInteger;
import java.util.Scanner;

public class SimpleAddition {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        BigInteger bi1, bi2, bi3;

        bi1 = new BigInteger(String.valueOf(sc.nextBigDecimal()));
        bi2 = new BigInteger(String.valueOf(sc.nextBigDecimal()));
        bi3 = bi1.add(bi2);

        System.out.println( bi3 );
    }
}
