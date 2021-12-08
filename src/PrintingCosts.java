import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingCosts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true) {
            if (sc.hasNextLine()) {
                list.add(sc.nextLine());
            }
            else {
                break;
            }
        }

        for (String cString : list
        ) {
            int tempValue = 0;

            for (int i = 0; i < cString.length(); i++) {
                char b = cString.charAt(i);
                if (Character.valueOf(b).equals(' ')) {
                    tempValue = tempValue + 0;
                } else if (Character.valueOf(b).equals('&')) {
                    tempValue = tempValue + 24;
                } else if (Character.valueOf(b).equals(',')) {
                    tempValue = tempValue + 7;
                } else if (Character.valueOf(b).equals('2')) {
                    tempValue = tempValue + 22;
                } else if (Character.valueOf(b).equals('8')) {
                    tempValue = tempValue + 23;
                } else if (Character.valueOf(b).equals('>')) {
                    tempValue = tempValue + 10;
                } else if (Character.valueOf(b).equals('D')) {
                    tempValue = tempValue + 26;
                } else if (Character.valueOf(b).equals('J')) {
                    tempValue = tempValue + 18;
                } else if (Character.valueOf(b).equals('P')) {
                    tempValue = tempValue + 23;
                } else if (Character.valueOf(b).equals('V')) {
                    tempValue = tempValue + 19;
                } else if (Character.valueOf(b).equals('\\')) {
                    tempValue = tempValue + 10;
                } else if (Character.valueOf(b).equals('b')) {
                    tempValue = tempValue + 25;
                } else if (Character.valueOf(b).equals('h')) {
                    tempValue = tempValue + 21;
                } else if (Character.valueOf(b).equals('n')) {
                    tempValue = tempValue + 18;
                } else if (Character.valueOf(b).equals('t')) {
                    tempValue = tempValue + 17;
                } else if (Character.valueOf(b).equals('z')) {
                    tempValue = tempValue + 19;
                } else if (Character.valueOf(b).equals('!')) {
                    tempValue = tempValue + 9;
                } else if (Character.valueOf(b).equals('\'')) {
                    tempValue = tempValue + 3;
                } else if (Character.valueOf(b).equals('-')) {
                    tempValue = tempValue + 7;
                } else if (Character.valueOf(b).equals('3')) {
                    tempValue = tempValue + 23;
                } else if (Character.valueOf(b).equals('9')) {
                    tempValue = tempValue + 26;
                } else if (Character.valueOf(b).equals('?')) {
                    tempValue = tempValue + 15;
                } else if (Character.valueOf(b).equals('E')) {
                    tempValue = tempValue + 26;
                } else if (Character.valueOf(b).equals('K')) {
                    tempValue = tempValue + 21;
                } else if (Character.valueOf(b).equals('Q')) {
                    tempValue = tempValue + 31;
                } else if (Character.valueOf(b).equals('W')) {
                    tempValue = tempValue + 26;
                } else if (Character.valueOf(b).equals(']')) {
                    tempValue = tempValue + 18;
                } else if (Character.valueOf(b).equals('c')) {
                    tempValue = tempValue + 17;
                } else if (Character.valueOf(b).equals('i')) {
                    tempValue = tempValue + 15;
                } else if (Character.valueOf(b).equals('o')) {
                    tempValue = tempValue + 20;
                } else if (Character.valueOf(b).equals('u')) {
                    tempValue = tempValue + 17;
                } else if (Character.valueOf(b).equals('{')) {
                    tempValue = tempValue + 18;
                } else if (Character.valueOf(b).equals('"')) {
                    tempValue = tempValue + 6;
                } else if (Character.valueOf(b).equals('(')) {
                    tempValue = tempValue + 12;
                } else if (Character.valueOf(b).equals('.')) {
                    tempValue = tempValue + 4;
                } else if (Character.valueOf(b).equals('4')) {
                    tempValue = tempValue + 21;
                } else if (Character.valueOf(b).equals(':')) {
                    tempValue = tempValue + 8;
                } else if (Character.valueOf(b).equals('@')) {
                    tempValue = tempValue + 32;
                } else if (Character.valueOf(b).equals('F')) {
                    tempValue = tempValue + 20;
                } else if (Character.valueOf(b).equals('L')) {
                    tempValue = tempValue + 16;
                } else if (Character.valueOf(b).equals('R')) {
                    tempValue = tempValue + 28;
                } else if (Character.valueOf(b).equals('X')) {
                    tempValue = tempValue + 18;
                } else if (Character.valueOf(b).equals('^')) {
                    tempValue = tempValue + 7;
                } else if (Character.valueOf(b).equals('d')) {
                    tempValue = tempValue + 25;
                } else if (Character.valueOf(b).equals('j')) {
                    tempValue = tempValue + 20;
                } else if (Character.valueOf(b).equals('p')) {
                    tempValue = tempValue + 25;
                } else if (Character.valueOf(b).equals('v')) {
                    tempValue = tempValue + 13;
                } else if (Character.valueOf(b).equals('|')) {
                    tempValue = tempValue + 12;
                } else if (Character.valueOf(b).equals('#')) {
                    tempValue = tempValue + 24;
                } else if (Character.valueOf(b).equals(')')) {
                    tempValue = tempValue + 12;
                } else if (Character.valueOf(b).equals('/')) {
                    tempValue = tempValue + 10;
                } else if (Character.valueOf(b).equals('5')) {
                    tempValue = tempValue + 27;
                } else if (Character.valueOf(b).equals(';')) {
                    tempValue = tempValue + 11;
                } else if (Character.valueOf(b).equals('A')) {
                    tempValue = tempValue + 24;
                } else if (Character.valueOf(b).equals('G')) {
                    tempValue = tempValue + 25;
                } else if (Character.valueOf(b).equals('M')) {
                    tempValue = tempValue + 28;
                } else if (Character.valueOf(b).equals('S')) {
                    tempValue = tempValue + 25;
                } else if (Character.valueOf(b).equals('Y')) {
                    tempValue = tempValue + 14;
                } else if (Character.valueOf(b).equals('_')) {
                    tempValue = tempValue + 8;
                } else if (Character.valueOf(b).equals('e')) {
                    tempValue = tempValue + 23;
                } else if (Character.valueOf(b).equals('k')) {
                    tempValue = tempValue + 21;
                } else if (Character.valueOf(b).equals('q')) {
                    tempValue = tempValue + 25;
                } else if (Character.valueOf(b).equals('w')) {
                    tempValue = tempValue + 19;
                } else if (Character.valueOf(b).equals('}')) {
                    tempValue = tempValue + 18;
                } else if (Character.valueOf(b).equals('$')) {
                    tempValue = tempValue + 29;
                } else if (Character.valueOf(b).equals('*')) {
                    tempValue = tempValue + 17;
                } else if (Character.valueOf(b).equals('0')) {
                    tempValue = tempValue + 22;
                } else if (Character.valueOf(b).equals('6')) {
                    tempValue = tempValue + 26;
                } else if (Character.valueOf(b).equals('<')) {
                    tempValue = tempValue + 10;
                } else if (Character.valueOf(b).equals('B')) {
                    tempValue = tempValue + 29;
                } else if (Character.valueOf(b).equals('H')) {
                    tempValue = tempValue + 25;
                } else if (Character.valueOf(b).equals('N')) {
                    tempValue = tempValue + 25;
                } else if (Character.valueOf(b).equals('T')) {
                    tempValue = tempValue + 16;
                } else if (Character.valueOf(b).equals('Z')) {
                    tempValue = tempValue + 22;
                } else if (Character.valueOf(b).equals('`')) {
                    tempValue = tempValue + 3;
                } else if (Character.valueOf(b).equals('f')) {
                    tempValue = tempValue + 18;
                } else if (Character.valueOf(b).equals('l')) {
                    tempValue = tempValue + 16;
                } else if (Character.valueOf(b).equals('r')) {
                    tempValue = tempValue + 13;
                } else if (Character.valueOf(b).equals('x')) {
                    tempValue = tempValue + 13;
                } else if (Character.valueOf(b).equals('~')) {
                    tempValue = tempValue + 9;
                } else if (Character.valueOf(b).equals('%')) {
                    tempValue = tempValue + 22;
                } else if (Character.valueOf(b).equals('+')) {
                    tempValue = tempValue + 13;
                } else if (Character.valueOf(b).equals('1')) {
                    tempValue = tempValue + 19;
                } else if (Character.valueOf(b).equals('7')) {
                    tempValue = tempValue + 16;
                } else if (Character.valueOf(b).equals('=')) {
                    tempValue = tempValue + 14;
                } else if (Character.valueOf(b).equals('C')) {
                    tempValue = tempValue + 20;
                } else if (Character.valueOf(b).equals('I')) {
                    tempValue = tempValue + 18;
                } else if (Character.valueOf(b).equals('O')) {
                    tempValue = tempValue + 26;
                } else if (Character.valueOf(b).equals('U')) {
                    tempValue = tempValue + 23;
                } else if (Character.valueOf(b).equals('[')) {
                    tempValue = tempValue + 18;
                } else if (Character.valueOf(b).equals('a')) {
                    tempValue = tempValue + 23;
                } else if (Character.valueOf(b).equals('g')) {
                    tempValue = tempValue + 30;
                } else if (Character.valueOf(b).equals('m')) {
                    tempValue = tempValue + 22;
                } else if (Character.valueOf(b).equals('s')) {
                    tempValue = tempValue + 21;
                } else if (Character.valueOf(b).equals('y')) {
                    tempValue = tempValue + 24;
                }
            }
            System.out.println(tempValue);
        }
        sc.close();
    }
}