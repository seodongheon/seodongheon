import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int m = sc.nextInt();
            char ch = sc.next().charAt(0);
            System.out.println(n*m);
            if(ch == 'C') break;
        }
    }
}