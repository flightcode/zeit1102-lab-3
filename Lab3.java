import java.util.*;

public class Lab3 {
    Scanner scan = new Scanner(System.in);

    enum Day {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

    public static void main(String[] args) {
        Lab3 l3 = new Lab3();
        l3.init();
    }

    public void init() {
        /*
         * System.out.print("Input two integers: "); int i1 = scan.nextInt(); int i2 =
         * scan.nextInt(); System.out.println("Random Number: " + random(i1,i2));
         */

        /*
         * System.out.print("Input string: "); String str = scan.nextLine();
         * System.out.println(""); System.out.print("Input character to count: "); char
         * c = scan.nextLine().toCharArray()[0]; System.out.println("Character Count: "
         * + strSearch(str,c));
         */

        /*
         * System.out.print("Input string: "); String str = scan.nextLine();
         * System.out.println(""); System.out.print("Input character to remove: "); char
         * c = scan.nextLine().toCharArray()[0]; System.out.println("New String: " +
         * strRemove(str,c));
         */

        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }

    int random(int i1, int i2) {
        Random r = new Random();
        int low;
        int high;
        if (i1 > i2) {
            high = i1;
            low = i2;
        } else if (i2 > i1) {
            high = i2;
            low = i1;
        } else {
            return 0;
        }
        return r.nextInt(high - low) + low;
    }

    int strSearch(String str, char c) {
        int i = 0;
        char[] arr = str.toCharArray();

        for (char character : arr) {
            if (character == c) {
                i += 1;
            }
        }
        return (i);
    }

    String strRemove(String str, char c) {
        String newStr = "";
        char[] arr = str.toCharArray();

        for (char character : arr) {
            if (character != c) {
                newStr += character;
            }
        }
        return (newStr);
    }
}