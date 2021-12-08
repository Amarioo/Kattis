import java.util.Scanner;

public class JudgingMoose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input1 = scan.nextInt();
        int input2 = scan.nextInt();
        int num = Math.max(input1, input2) * 2;
        if(input1 != input2)
            System.out.println("Odd " + num);
        else if(input1 != 0)
            System.out.println("Even " + num);
        else
            System.out.println("Not a moose");
    }
}