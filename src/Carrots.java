import java.io.IOException;
import java.util.Scanner;

public class Carrots {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int [] input = new int[2];
        for (int i = 0 ; i <input.length; i++){
            input[i]=scanner.nextInt();
        }
        System.out.println(input[1]);
    }
}
