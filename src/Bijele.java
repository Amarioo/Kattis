import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] nums = new int[6];
        int [] def = {1,1,2,2,2,8};

        for (int i = 0; i<nums.length; i++){
            nums[i]=scan.nextInt();
        }
        for (int i = 0 ; i<nums.length; i++){
            System.out.print(def[i]-nums[i]+" ");
        }
    }
}
