import java.util.*;

public class Toggle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (a[i] >= 'a' && a[i] <= 'z') {
                s = s.toUpperCase();
            }
            if (a[i] >= 'A' && a[i] <= 'Z')
                s = s.toLowerCase();
        }
        for (int i = 0; i < s.length(); i++)
            System.out.print(a[i]);
    }
}