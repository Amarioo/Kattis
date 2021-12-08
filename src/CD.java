import java.util.Arrays;

public class CD {
    public static void main(String[] args) {
        Kattio scan = new Kattio(System.in);

        while (true) {
            int n1 = scan.getInt();
            int n2 = scan.getInt();
            if (n1 == 0 && n2 == 0) {
                break;
            }
            int[] cds = new int[n1];
            int count = 0;
            for (int i = 0; i < n1; i++) {
                cds[i] = scan.getInt();
            }
            for (int i = 0; i < n2; i++) {
                if (Arrays.binarySearch(cds, scan.getInt()) >= 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
        scan.close();
    }
}

