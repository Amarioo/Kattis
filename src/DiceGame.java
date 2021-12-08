import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i<4; i++){
            sum1= sum1+ scan.nextInt();
        }

        for (int i = 0; i<4; i++){
            sum2= sum2+ scan.nextInt();
        }

        if (sum1 == sum2){
            System.out.println("Tie");
        }
        else if (sum1 < sum2){
            System.out.println("Emma");
        }
        else{
            System.out.println("Gunnar");
        }
    }
}
