import java.util.Scanner;
public class HeartRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- > 0){
            int b = sc.nextInt();
            double p = sc.nextDouble();
            double bpm = 60 * b / p;
            double variance = 60 / p;
            System.out.printf("%f %f %f%n", bpm - variance, bpm, bpm + variance);
        }
    }
}
