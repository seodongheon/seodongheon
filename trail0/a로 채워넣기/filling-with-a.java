import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int len = str.length();

        str = str.substring(0,1) + "a" + str.substring(2);
        str = str.substring(0, len - 2) + "a" + str.substring(len - 1);

        System.out.print(str);


    }
}