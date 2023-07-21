import java.util.*;

public class Reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }
}