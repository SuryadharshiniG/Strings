import java.util.*;

public class Removechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if ((a[i] >= 'a' && a[i] <= 'z') || (a[i] >= 'A' && a[i] <= 'Z')) {
                System.out.print(a[i]);
            }
        }
    }
}
