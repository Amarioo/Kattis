import java.util.ArrayList;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0 ; i <input.length; i++){
            input[i]=scanner.nextInt() % 42;

            if (!arrayList.contains(input[i])){
                //System.out.println(input[i]);
                arrayList.add(input[i]);
            }

        }
        System.out.println(arrayList.size());
    }
    }

