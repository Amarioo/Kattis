import java.util.Scanner;
public class DeathKnightHero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        char b;
        int n = scan.nextInt();
        String input []= new String[n];
        char[] ba;
        for (int i = 0 ; i<n; i++){
            input[i] = scan.next();
            ba=input[i].toCharArray();
            for (int j=0; j<ba.length-1; j++){
                if (ba[j]=='C' && ba[j+1]=='D'){
                    counter++;
                    break;
                }
            }
        }
        System.out.println(n-counter);
    }
}
