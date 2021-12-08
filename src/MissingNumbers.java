import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        List <Integer> endedList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        int n2 = list.get(list.size() - 1);

        for (int i =1; i<n2+1; i++){
            endedList.add(i);
        }
        endedList.removeAll(list);
        if (endedList.isEmpty()){
            System.out.print("good job");
        }
        else {
            for (int endedlistValues: endedList) {
                System.out.println(endedlistValues);
            }
        }
    }
}