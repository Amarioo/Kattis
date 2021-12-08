import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int tempcounter = 0;

        String[] numbers = scan.nextLine().split(";");
        for (String number : numbers) {
            count++;
            if (number.contains("-")) {
                String[] tempnr = number.split("-");
                int start = Integer.parseInt(tempnr[0]);
                int finish = Integer.parseInt(tempnr[1]);
                for (int k = start; k < finish; k++) {
                    tempcounter++;
                }
            }
        }
        System.out.println(tempcounter + count);
    }
}
