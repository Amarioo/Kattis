import java.util.Scanner;

public class JanitorTroubles {
    static double maxArea(double a, double b, double c, double d) {
        double semiperimeter = (a + b + c + d) / 2;

        return Math.sqrt((semiperimeter - a) *
                (semiperimeter - b) *
                (semiperimeter - c) *
                (semiperimeter - d));
    }
    public static void main (String[] args) {
        int array [] = new int[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0 ; i < 4; i++){
            array[i]=scanner.nextInt();
        }

        double a = array[0], b = array[1], c= array[2], d = array[3];
        System.out.println(maxArea(a, b, c, d));
    } }
