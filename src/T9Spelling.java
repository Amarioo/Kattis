import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T9Spelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 2);
        map.put('b', 22);
        map.put('c', 222);
        map.put('d', 3);
        map.put('e', 33);
        map.put('f', 333);
        map.put('g', 4);
        map.put('h', 44);
        map.put('i', 444);
        map.put('j', 5);
        map.put('k', 55);
        map.put('l', 555);
        map.put('m', 6);
        map.put('n', 66);
        map.put('o', 666);
        map.put('p', 7);
        map.put('q', 77);
        map.put('r', 777);
        map.put('s', 7777);
        map.put('t', 8);
        map.put('u', 88);
        map.put('v', 888);
        map.put('w', 9);
        map.put('x', 99);
        map.put('y', 999);
        map.put('z', 9999);
        int counter = 0, n = scan.nextInt();
        while (n-- > 0) {
            counter++;
            String inputString = scan.nextLine();
            System.out.print("Case #" + counter + ": ");
            if (inputString.isEmpty()) {
                inputString = scan.nextLine();
            }
            String previousChar = " ";
            for (int i = 0; i < inputString.length(); i++) {
                char currentChar = inputString.charAt(i);
                if (currentChar == ' ') {
                    currentChar = '0';
                }
                if (String.valueOf(currentChar).equals("0") && previousChar.equals("0")) {
                    System.out.print(" 0");
                } else if (String.valueOf(currentChar).equals("0") && !previousChar.equals("0")) {
                    System.out.print(currentChar);
                }
                if (map.containsKey(currentChar)) {
                    String s1 = String.valueOf(map.get(currentChar));
                    if (previousChar.contains(String.valueOf(Character.toLowerCase(s1.charAt(0))))) {
                        System.out.print(" " + map.get(currentChar));
                    } else {
                        System.out.print(map.get(currentChar));
                        previousChar = String.valueOf(map.get(currentChar));
                    }
                }
                if (String.valueOf(currentChar).equals("0")) {
                    previousChar = "0";
                }
            }
            System.out.println();
        }
    }
}