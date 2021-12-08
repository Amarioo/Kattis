import java.util.Arrays;
import java.util.Scanner;

public class ABCsecondSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();
        String input = scan.next();
        int array [] ={first,second,third};
        Arrays.sort(array);
        char b;

        for (int i = 0 ; i<input.length();i++) {
            b=input.charAt(i);
            if (b =='A'){
                System.out.print(array[0]+" ");
            }
            else if (b=='B'){
                System.out.print(array[1]+" ");
            }
            else {
                System.out.print(array[2]+" ");
            }

        }
    }
}
