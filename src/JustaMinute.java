import java.util.Scanner;

public class JustaMinute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sumofSec=0;
        double sumofMin=0;
        double numbers = scan.nextInt();
        double input;
        double input1;
        double output;
        for (int i = 0 ; i<numbers; i++){
            input=scan.nextInt();
            input1=scan.nextInt();
            sumofMin=sumofMin+input;
            sumofSec=sumofSec+input1;
        }
        output=sumofSec/(sumofMin*60);
        if (output<=1){
            System.out.println("measurement error");
        }
        else{
            System.out.println(output);
        }
    }
}
