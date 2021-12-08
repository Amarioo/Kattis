import java.util.Scanner;

public class Beekeper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String tempBiggest ="";
            int tempBiggestCounter = 0;
            int n = scan.nextInt();
            if (n == 0) {
                break;
            } else {
                for (int i = 0; i < n; i++) {
                    int counter = 0;
                    String str = scan.nextLine();
                    if (str.isEmpty()) {
                        str = scan.nextLine();
                    }
                    char lastCharVowel = ' ';
                    for (int j = 0; j < str.length(); j++) {
                        char b = str.charAt(j);
                        if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' || b == 'y') {
                            if (b == lastCharVowel) {
                                counter++;
                            }
                        }
                        lastCharVowel = b;
                    }
                    if (tempBiggestCounter<=counter){
                        tempBiggestCounter=counter;
                        tempBiggest = str;
                    }
                }
            }
            System.out.println(tempBiggest);
        }
        scan.close();
    }
}
