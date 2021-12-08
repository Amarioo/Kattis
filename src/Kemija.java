import java.util.Scanner;
public class Kemija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split("");
        for(int i =0; i < line.length; i++){
            System.out.print(line[i]);
            if (line[i].equals("e") || line[i].equals("a") || line[i].equals("i") || line[i].equals("o") || line[i].equals("u")){
                i+=2;
            }
        }
    }
}
