import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Keywords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        String tempWord;
        Set<String> unorderedList = new HashSet<>();

        for (int i =0; i<cases+1; i++){
            tempWord = scan.nextLine();
            tempWord = tempWord.toLowerCase();
            if(tempWord.contains("-")) {
                tempWord = tempWord.replace("-"," ");
            }
            if (tempWord.isEmpty()){
                continue;
            }
            else {
                unorderedList.add(tempWord);
            }
        }
        System.out.println(unorderedList.size());
    }
}
