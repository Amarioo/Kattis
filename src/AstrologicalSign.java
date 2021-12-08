import java.util.Scanner;

public class AstrologicalSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String sign = "";
        while (n-- > 0) {
            int day = scan.nextInt();
            String month = scan.next();
            switch (month) {
                case "Jan":
                    if (day < 21) {
                        sign = "Capricorn";
                    } else
                        sign = "Aquarius";

                    break;
                case "Feb":
                    if (day < 20) {
                        sign = "Aquarius";
                    } else
                        sign = "Pisces";

                    break;
                case "Mar":
                    if (day < 21) {
                        sign = "Pisces";
                    } else
                        sign = "Aries";

                    break;
                case "Apr":
                    if (day < 21) {
                        sign = "Aries";
                    } else
                        sign = "Taurus";

                    break;
                case "May":
                    if (day < 21) {
                        sign = "Taurus";
                    } else
                        sign = "Gemini";

                    break;
                case "Jun":
                    if (day < 22) {
                        sign = "Gemini";
                    } else
                        sign = "Cancer";

                    break;
                case "Jul":
                    if (day < 23) {
                        sign = "Cancer";
                    } else
                        sign = "Leo";

                    break;
                case "Aug":
                    if (day < 23) {
                        sign = "Leo";
                    } else
                        sign = "Virgo";

                    break;
                case "Sep":
                    if (day < 22) {
                        sign = "Virgo";
                    } else
                        sign = "Libra";

                    break;
                case "Oct":
                    if (day < 23) {
                        sign = "Libra";
                    } else
                        sign = "Scorpio";

                    break;
                case "Nov":
                    if (day < 23) {
                        sign = "Scorpio";
                    } else
                        sign = "Sagittarius";

                    break;
                case "Dec":
                    if (day < 22) {
                        sign = "Sagittarius";
                    } else
                        sign = "Capricorn";

                    break;
            }
            System.out.println(sign);
        }
        scan.close();
    }
}
