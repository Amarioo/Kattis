import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tracker = 0;
        int index = 0;
        int index2 = 0;
        int number = scan.nextInt();
        String findStr = "pink";
        String fiffi = "rose";
        String inputs[] = new String[number];
        for (int i = 0; i < number; i++) {
            inputs[i] = scan.next();
        }
        for (int k = 0; k < number; k++) {
            inputs[k] = inputs[k].toLowerCase();
        }
        for (int k = 0; k < inputs.length; k++) {
            index = inputs[k].indexOf(findStr, index);

            if (index != -1) {
                tracker++;

            }
        }
        for (int j = 0; j < inputs.length; j++) {
            index2 = inputs[j].indexOf(fiffi, index);
            if (index2 != -1) {
                tracker++;
            }
        }

        if (tracker==0){
            System.out.println("I must watch Star Wars with my daughter");
        }
        else
        {
            System.out.println(tracker);
        }
    }
}

//inputs[k].equals("pink")||inputs[k].equals("rose")