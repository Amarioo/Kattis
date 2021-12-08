import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] Input = new int[2];

        for (int i = 0 ; i <Input.length; i++){
            Input[i]=scan.nextInt();
        }
        System.out.print(((Input[1]-1)*(Input[0])+1));
    }
}
