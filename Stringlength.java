import java.util.*;

public class Stringlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        String s3;
        System.out.println(s.length());
        System.out.println(s1.length());
        s3 = s + s1;
        System.out.println(s3);
        System.out.println(s3.length());
    }
}
