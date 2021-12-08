import java.util.Scanner;
public class Aaah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int counter1 = 0;
        String array[]=new String[2];
        char b;
        for (int k =0; k<2;k++){
            array[k]=scanner.nextLine();
        }
        for (int i = 0; i < array[0].length(); i++) {
            b = array[0].charAt(i);
            if (Character.isLetter(b)) {
                counter1++;
            }
        }
        for (int i = 0; i < array[1].length(); i++) {
            b = array[1].charAt(i);
            if (Character.isLetter(b)) {
                counter++;
            }
        }
        if (counter1<counter){
            System.out.print("no");
        }
        else System.out.print("go");
    }
}
