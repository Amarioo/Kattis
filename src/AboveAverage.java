import java.util.Scanner;
public class AboveAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum;
        double counter;
        double temp = 0;
        int N = scan.nextInt();
        while (N-- > 0) {
            int N2 = scan.nextInt();
            counter = N2;
            double array[] = new double[N2];
            for (int i = 0; i < N2; i++) {
                sum = scan.nextDouble();
                array[i] = sum;
                temp = temp + sum;
            }
            double average = temp / counter;
            double c = 0;
            for (int i = 0; i < N2; i++) {
                if (array[i] > average) {
                    c++;
                }
            }
            System.out.printf("%.3f%s  \n", (c / N2)* 100, "%");
            temp=0;
        }
    }
}

