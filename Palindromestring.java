import java.util.*;

public class Palindromestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";
        char a[] = s.toCharArray();
        for (int i = a.length - 1; i >= 0; i--) {
            s1 = s1 + a[i];
        }
        System.out.println(s1);
        System.out.println(s);
        if (s1.equals(s))
            System.out.print("Palindrome string");
        else
            System.out.println(" Not a Palindrome string");
    }
}
