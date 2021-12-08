import java.util.Scanner;
public class Pet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s=0;
        int array[]= new int[5];
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<4; j++){
                int scann = scan.nextInt();
                s=s+scann;
            }
            array[i]=s;
            s=0;
        }
        int sum=array[0];
        int arrayplats=0;
        for (int i = 0; i<array.length; i++){
            if (array[i]>sum){
                arrayplats=i;
                sum=array[i];
            }
        }
        System.out.println(arrayplats+1+" "+sum);
    }
}
