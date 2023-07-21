import java.util.*;

public class Removevowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
                s = s.replace(a[i], '\0');
            }
        }
        System.out.print(s);
    }
}
