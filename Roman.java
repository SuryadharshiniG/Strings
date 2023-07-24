import java.util.*;

public class Roman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        String c = "";
        String c1 = "", c2 = "", c3 = "", c4 = "", c5 = "", c6 = "", c7 = "";
        for (int i = 0; i < s.length(); i++) {
            if (a[i] == 'I')
                c1 = "1";
            if (a[i] == 'V')
                c2 = "5";
            if (a[i] == 'X')
                c3 = "10";
            if (a[i] == 'L')
                c4 = "50";
            if (a[i] == 'C')
                c5 = "100";
            if (a[i] == 'D')
                c6 = "500";
            if (a[i] == 'M')
                c7 = "5000";

        }
        c = c1 + c2 + c3 + c4 + c5 + c6 + c7;
        System.out.print(c);
    }
}
