import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        int c;
        for (int i = 0; i < s.length(); i++) {
            c = 1;
            for (int j = 0; j < s.length(); j++) {
                if (a[i] == a[j]) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
