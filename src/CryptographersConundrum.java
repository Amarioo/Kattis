import java.util.Scanner;

public class CryptographersConundrum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int counter = 0;
        for (int i = 0; i<string.length(); i+=3){
           /*if (string.charAt(i) != 'P' || string.charAt(i+1) != 'E' || string.charAt(i+2) != 'R'){
               counter++;
           }*/
            if (string.charAt(i) != 'P') {
                counter++;
            }
            if (string.charAt(i + 1) != 'E'){
                counter++;}
            if (string.charAt(i + 2) != 'R'){
                counter++;}

        }
        System.out.println(counter);
    }
}
