import java.util.Scanner;
public class LastFactorialDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(scanner.nextLine());
        int[] array = new int[noOfTestCases];
        for(int i=0;i<noOfTestCases;i++){
            int findfactorOfNumber = scanner.nextInt();
            int factor = 1;
            for(int j=1;j<=findfactorOfNumber;j++){
                factor =factor*j;
            }
            array[i]=factor%10;
        }
        for(int i: array) {
            System.out.println(i);}
    }
    }
//stulet tyvärr
