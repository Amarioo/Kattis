import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Östgötska {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        List<String> arraylist = new ArrayList<>(Arrays.asList(words));
        List<String> testStream = arraylist.stream().filter(objects -> objects.contains("ae")).collect(Collectors.toList());
        double ae = testStream.size();
        double strC = arraylist.size();
        if (ae / strC < 0.4) {
            System.out.println("haer talar vi rikssvenska");
        } else {
            System.out.println("dae ae ju traeligt va");
        }
    }
}