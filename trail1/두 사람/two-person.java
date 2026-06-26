import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aAge = sc.nextInt();
        char a = sc.next().charAt(0);
        int bAge = sc.nextInt();
        char b = sc.next().charAt(0);

        if( (aAge >= 19 && a == 'M') || (bAge >= 19 && b == 'M') ){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}
