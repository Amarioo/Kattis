import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ptice {
    public static void main(String[] args) {
        int brunoCheck = 0, adrianCheck = 0,goranCheck = 0 ;
        Map<String, Integer> persons = new HashMap<>();
        char[] goranArray = {'C', 'C', 'A', 'A', 'B', 'B'}, adrianArray = {'A', 'B', 'C'}, brunoArray = {'B', 'A', 'B', 'C'};
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] l = scan.next().toCharArray();
        for (int i = 0; i < n; i++) {
            if (adrianArray[i % 3] == l[i]) {
                adrianCheck++;
            }
            if (brunoArray[i % 4] == l[i]) {
                brunoCheck++;
            }
            if (goranArray[i % 6] == l[i]) {
                goranCheck++;
            }
        }
        persons.put("Goran", goranCheck);
        persons.put("Adrian", adrianCheck);
        persons.put("Bruno", brunoCheck);
        int max = persons.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
        System.out.println(max);
        if (adrianCheck == max) {
            System.out.println("Adrian");
        }
        if (brunoCheck == max) {
            System.out.println("Bruno");
        }
        if (goranCheck == max) {
            System.out.println("Goran");
        }
    }
}