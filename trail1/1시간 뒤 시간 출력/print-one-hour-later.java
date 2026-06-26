import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] str = s.split(":");

        int h = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        System.out.println((h+1) + ":" + m);

    }
}