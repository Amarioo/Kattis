import java.util.Scanner;
public class R2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Array[] = new int[2];
        for (int i = 0; i<2 ; i++){
            Array[i] = scanner.nextInt();
        }
        System.out.println(2*Array[1]-Array[0]);
    }
}
