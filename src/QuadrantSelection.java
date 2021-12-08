import java.util.Scanner;

public class QuadrantSelection {
    public static void main(String[] args) {
        int [] input = new int[2];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<input.length; i++){
            input[i]=scan.nextInt();
        }
        if (input[0]>0 && input[1]>0){
            System.out.print(1);
        }
        else if (input[0]<0 && input[1]<0){
            System.out.print(3);
        }
        else if (input[0]<0 && input[1]>0){
            System.out.print(2);
        }
        else{
            System.out.print(4);
        }
    }
}
