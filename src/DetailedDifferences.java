import java.util.Scanner;

public class DetailedDifferences {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int counter =  scanner.nextInt();
        while (counter-- > 0){
            String fl=scanner.next();
            String sl = scanner.next();
            System.out.println(fl + "\n" + sl);
            for (int i =0 ; i<fl.length(); i++){
                if (fl.charAt(i)==sl.charAt(i)){
                    System.out.print(".");
                }
                else {System.out.print("*");
                }
            }
            System.out.println("\n");

        }
        scanner.close();
    }
}
