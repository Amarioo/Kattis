import java.util.Scanner;

public class HelpaPhDcandidateout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        while (n-- >0) {
            String line = scanner.nextLine();
            if (line.contains("P=NP")){
                System.out.println("skipped");
            }else {
                int plus = line.indexOf("+");
                int n1 = Integer.parseInt(line.substring(0,plus));
                int n2 = Integer.parseInt(line.substring(plus));
                System.out.println(n1 + n2);
            }
        }
    }
}
