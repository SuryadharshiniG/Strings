import java.util.*;

public class sumofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (a[i] == '1' || a[i] == '2' || a[i] == '3' || a[i] == '4' || a[i] == '5' || a[i] == '6' || a[i] == '7'
                    || a[i] == '8'
                    || a[i] == '9' || a[i] == '0') {
                sum = sum + (a[i] - 48);
            }
        }
        System.out.print(sum);
    }
}
