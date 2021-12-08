import java.util.Scanner;
public class DiceCup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inp = scan.nextInt();
        int inp2 = scan.nextInt();

        if (inp==inp2){
            System.out.println(inp+1);
        }
        else if (inp<inp2){
            inp=inp+1;
            for (int i = inp ; i<= inp2+1; i++){
                System.out.println(inp++);
            }
        }
        else {
            inp2=inp2+1;
            for (int i = inp2 ; i<= inp+1; i++){
                System.out.println(inp2++);
            }
        }
    }
}
