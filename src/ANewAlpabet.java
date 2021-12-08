import java.util.Scanner;
public class ANewAlpabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input[] = new String[1];
        char[] ba;
         input[0] = scan.nextLine();
            ba = input[0].toCharArray();
            for (int j = 0; j < ba.length; j++) {
                if (ba[j] == 'a' || ba[j]=='A') {
                    System.out.print("@");
                }
                else if (ba[j] == 'b' || ba[j]=='B'){
                    System.out.print("8");
                }
                else if (ba[j] == 'c' || ba[j]=='C'){
                    System.out.print("(");
                }
                else if (ba[j] == 'd' || ba[j]=='D'){
                    System.out.print("|)");
                }
                else if (ba[j] == 'e' || ba[j]=='E'){
                    System.out.print("3");
                }
                else if (ba[j] == 'f' || ba[j]=='F'){
                    System.out.print("#");
                }
                else if (ba[j] == 'g' || ba[j]=='G'){
                    System.out.print("6");
                }
                else if (ba[j] == 'h' || ba[j]=='H'){
                    System.out.print("[-]");
                }
                else if (ba[j] == 'i' || ba[j]=='I'){
                    System.out.print("|");
                }
                else if (ba[j] == 'j' || ba[j]=='J'){
                    System.out.print("_|");
                }
                else if (ba[j] == 'k' || ba[j]=='K'){
                    System.out.print("|<");
                }
                else if (ba[j] == 'l' || ba[j]=='L'){
                    System.out.print("1");
                }
                else if (ba[j] == 'm' || ba[j]=='M'){
                    System.out.print("[]\\/[]");
                }
                else if (ba[j] == 'n' || ba[j]=='N'){
                    System.out.print("[]\\[]");
                }
                else if (ba[j] == 'o' || ba[j]=='O'){
                    System.out.print("0");
                }
                else if (ba[j] == 'p' || ba[j]=='P'){
                    System.out.print("|D");
                }
                else if (ba[j] == 'q' || ba[j]=='Q'){
                    System.out.print("(,)");
                }
                else if (ba[j] == 'r' || ba[j]=='R'){
                    System.out.print("|Z");
                }
                else if (ba[j] == 's' || ba[j]=='S'){
                    System.out.print("$");
                }
                else if (ba[j] == 't' || ba[j]=='T'){
                    System.out.print("']['");
                }
                else if (ba[j] == 'u' || ba[j]=='U'){

                    System.out.print("|_|");
                }
                else if (ba[j] == 'v' || ba[j]=='V'){
                    System.out.print("\\/");
                }
                else if (ba[j] == 'w' || ba[j]=='W'){
                    System.out.print("\\/\\/");
                }
                else if (ba[j] == 'x' || ba[j]=='X'){
                    System.out.print("}{");
                }
                else if (ba[j] == 'y' || ba[j]=='Y'){
                    System.out.print("`/");
                }
                else if (ba[j] == 'z' || ba[j]=='Z'){
                    System.out.print("2");
                }
                else {
                    System.out.print(ba[j]);
                }
            }
    }
}


