import java.util.Scanner;

public class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        for (int i =0; i<time; i++){
            System.out.println(1+i+" Abracadabra");
        }
    }
}
