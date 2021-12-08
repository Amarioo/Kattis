import java.util.Scanner;
public class Trik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char [] charArray = scan.next().toCharArray();
        int p =1;
        for (int i =0 ; i<charArray.length; i++){
            if (charArray[i]=='A'){
               if (p==1){
                   p=2;
               }
               else if (p==2){
                   p=1;
               }
                else{
                p=3;
                }
            }
            else if (charArray[i]=='B'){
                if (p==2){
                    p=3;
                }
                else if (p==3){
                    p=2;
                }
                else {
                    p=1;
                }
            }
            else if (charArray[i]=='C'){
                if (p==1){
                    p=3;
                }
                else if (p==3){
                    p=1;
                }
                else {
                    p=2;
                }
            }
        }
        System.out.println(p);
    }
}
