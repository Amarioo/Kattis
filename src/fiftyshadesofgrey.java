import java.util.Scanner;

public class fiftyshadesofgrey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tracker = 0;
        int number = scan.nextInt();
        String inputs[] = new String[number];
        for (int i = 0; i < number; i++) {
            inputs[i] = scan.next();
        }
        for (int k = 0; k < number; k++) {
            inputs[k] = inputs[k].toLowerCase();
        }
        for (int i = 0; i < number; i++) {
            if (inputs[i].matches("(.*)rose(.*)")||inputs[i].matches("(.*)pink(.*)")){
                tracker++;
            }
        }
if (tracker==0){
    System.out.println("I must watch Star Wars with my daughter");
}
else {
    System.out.println(tracker);
}

      //  System.out.println(Str.matches("(.*)Tutorials(.*)"));
    }
}
