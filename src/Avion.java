import java.util.ArrayList;
import java.util.Scanner;
public class Avion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        String inputs[] = new String[5];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = scan.next();
        }
        for (int k = 0; k < inputs.length; k++) {
            if (inputs[k].matches("(.*)FBI(.*)")) {
                list.add(k);
            }
        }
        if (list.size()==0){
            System.out.print("HE GOT AWAY!");
        }
        else {
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+1+" ");
            }
        }
    }
}
