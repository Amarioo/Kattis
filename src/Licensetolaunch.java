import java.util.Scanner;
public class Licensetolaunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int input = scanner.nextInt();
        int array [] = new int[input];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int min = array[0];

        for(int i = 0; i < array.length; i++)
        {
            if(min > array[i])
            {
                min = array[i];
                index=i;
            }
        }
        System.out.println(index);
    }
}
