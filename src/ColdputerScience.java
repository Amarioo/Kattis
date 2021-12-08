import java.util.Scanner;

public class ColdputerScience {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter = 0;
        int input = scan.nextInt();
        int x;
        for (int i = 0 ; i<input; i++){
            x = scan.nextInt();
            if (x<0){
                counter++;
            }
        }

System.out.print(counter);
    }
}
