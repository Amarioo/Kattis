import java.util.Scanner;

public class BitByBit {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char[] bit = new char[32];
    do {
        for (int i = 0; i <= 31; i++) {
            bit[i] = '?';
        }
        int instruktioner = scan.nextInt(); // läser in första raden i operationen vilket är en siffra.
        if (instruktioner == 0) {
            break;
        }
        for (int numIn = 0; numIn < instruktioner; numIn++) {    //for som läser igenom alla instruktioner
            String readOperation = scan.next();//läser in första instruktionen
            switch (readOperation) { // alla olika scenarion , byter ut varje
                case "CLEAR": {
                    int plats = scan.nextInt();
                    bit[plats] = '0';
                    break;
                }
                case "SET": {
                    int plats = scan.nextInt();
                    bit[plats] = '1';
                    break;
                }
                case "OR": {
                    int orInp1 = scan.nextInt();
                    int orInp2 = scan.nextInt();

                    if (bit[orInp2] == '1' || bit[orInp1] == '1') {
                        bit[orInp1] = '1';
                    } else if (bit[orInp2] == '?') {
                        bit[orInp1] = '?';
                    }
                    break;

                }
                case "AND": {
                    int andInput1 = scan.nextInt();
                    int andInput2 = scan.nextInt();

                    if (bit[andInput2] == '0' || bit[andInput1] == '0') {
                        bit[andInput1] = '0';
                    }
                    else if (bit[andInput2] == '?'){
                        bit[andInput1] = '?';
                    }
                    break;
                }
            }
        }
        for (int i = 31; i >= 0; i--) {
            System.out.print(bit[i]);
        }
        System.out.println();
    }while (true);
}
}
