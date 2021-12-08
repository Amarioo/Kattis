import java.util.Arrays;
import java.util.Scanner;
public class ABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input = new int[3];
        String [] strings = new String[1];
        for (int i = 0 ; i <input.length; i++){
            input[i]=scanner.nextInt();
        }
        for (int i = 0 ; i <1; i++){
             strings[i]=scanner.next();
        }
        Arrays.sort(input);
        if (strings[0].equals("ABC")){
            System.out.print(input[0]+" "+input[1]+" "+input[2]);
        }
        else if (strings[0].equals("ACB")){
            System.out.print(input[0]+" "+input[2]+" "+input[1]);
        }
        else if (strings[0].equals("BAC")){
            System.out.print(input[1]+" "+input[0]+" "+input[2]);
        }
        else if (strings[0].equals("BCA")){
            System.out.print(input[1]+" "+input[2]+" "+input[0]);
        }
        else if (strings[0].equals("CBA")){
            System.out.print(input[2]+" "+input[1]+" "+input[0]);
        }
        else {
            System.out.print(input[2]+" "+input[0]+" "+input[1]);
        }
    }
}
