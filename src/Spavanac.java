import java.util.Scanner;
public class Spavanac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int minTot = m-45;
        if (minTot<0 && h!=0){
            System.out.println(h-1+" "+(60-Math.abs(minTot)));
        }
       else if (minTot>0){
            System.out.println(h+" "+((Math.abs(minTot))));
        }

        else {
            System.out.println(23 + " " + (60 - Math.abs(minTot)));
        }
    }
}
