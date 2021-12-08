import java.util.Scanner;
public class Tarifa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int N = scanner.nextInt();
        int temp;
        int counter =0;
        int value ;
        while (N-- >0){
                 value = scanner.nextInt();
            if (value>sum) {
                temp = sum - value;
            }
            else {
                temp = Math.abs(value - sum);
            }
                counter = counter + temp;
        }
        System.out.println(counter+sum);
    }
}
