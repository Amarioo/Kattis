import java.util.Scanner;
public class OneChickenPerPerson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] input = new int[2];
        for (int i = 0 ; i <input.length; i++){
            input[i]=scan.nextInt();
        }
        if (input[0]<input[1]&&input[1]-input[0]==1){
            System.out.print("Dr. Chaz will have 1 piece of chicken left over!");
        }
        else if (input[0]<input[1]){
            System.out.print("Dr. Chaz will have "+(input[1]-input[0])+" pieces of chicken left over!");
        }
        else if (input[0]>input[1]&&input[0]-input[1]==1){
            System.out.print("Dr. Chaz needs 1 more piece of chicken!");
        }
        else System.out.print("Dr. Chaz needs "+(input[0]-input[1])+" more pieces of chicken!");
    }
}
