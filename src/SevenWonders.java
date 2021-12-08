import java.util.Scanner;
public class SevenWonders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counterT=0;
        int counterC =0;
        int counterG=0;
        String input = scanner.nextLine();
        char b ;
        for (int i = 0 ; i<input.length();i++) {
            b=input.charAt(i);
            if (b=='T') {
                counterT++;
            }
            else if (b=='C'){
                counterC++;
            }
            else if (b=='G'){
                counterG++;
            }
    }
        System.out.println(7*Math.min(Math.min(counterT,counterC),counterG) + counterT*counterT+counterC*counterC+counterG*counterG);
    }
}
