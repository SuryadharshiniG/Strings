import java.util.*;

public class Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (a[i] == '\0') {
                break;
            } else
                c++;
        }
        System.out.println(c);
    }
}