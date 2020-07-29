import java.util.*;

public class Lab3 {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Lab3 l3 = new Lab3();
        l3.init();
    }

    public void init() {
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        System.out.println("");
        String option;
        do {
            System.out.println("The current string is: " + str);
            System.out.println("Do you want to");
            System.out.println("(q)uit the program");
            System.out.println("add a (n)ew string");
            System.out.println("determine if a (p)alindrome");
            System.out.print("(r)everse the string: ");
            option = scan.nextLine();
            System.out.println("");
            switch (handleResponse(option)) {
                case 1:
                    System.out.print("What is the new string: ");
                    str = scan.nextLine();
                    System.out.println("");
                    break;
                case 2:
                    if (palindrome(str)) {
                        System.out.println("Yes it is!");
                        System.out.println("");
                    } else {
                        System.out.println("No it isn't );");
                        System.out.println("");
                    }
                    break;
                case 3:
                    str = reverse(str);
                    break;
                case 0:
                    System.out.println("bye!");
                    break;
            }
        } while (handleResponse(option) != 0);
    }

    int handleResponse(String input) {
        switch (input.charAt(0)) {
            case 'q':
            case 'Q':
                return 0;
            case 'n':
            case 'N':
                return 1;
            case 'p':
            case 'P':
                return 2;
            case 'r':
            case 'R':
                return 3;
            default:
                return -1;
        }
    }

    boolean palindrome(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(input.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }

    String reverse(String input) {
        String reverse = "";
        for (int i = 0; i < input.length(); i++) {
            reverse = reverse + input.charAt(input.length() - (i + 1));
        }
        return reverse;
    }
}