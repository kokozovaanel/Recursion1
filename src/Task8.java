import java.util.Scanner;

public class Task8 {

    public static boolean isDigits(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return isDigits(s, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (isDigits(s, 0))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}