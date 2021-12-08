import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        for (int i = 1; i<C+1; i++){

            if (i%A ==0 && i%B==0){
                System.out.println("FizzBuzz");
            }
            else if (i%A==0){
                System.out.println("Fizz");
            }
            else if (i%B==0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
