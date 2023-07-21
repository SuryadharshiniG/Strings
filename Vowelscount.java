import java.util.*;

public class Vowelscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
                c++;
            }
        }
        System.out.print(c);
    }
}
