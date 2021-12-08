import java.util.Scanner;
public class Nastyhacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter =  scanner.nextInt();
        while (counter-- >0){
            int r=scanner.nextInt();
            int e=scanner.nextInt();
            int c=scanner.nextInt();
            if (e-c>r){
                System.out.println("advertise");
            }
            else if (e-c==r){
                System.out.println("does not matter");
            }
            else {
                System.out.println("do not advertise");
            }
        }
    }
}
