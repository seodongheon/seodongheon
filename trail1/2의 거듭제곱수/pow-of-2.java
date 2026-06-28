import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while(true){
            n /= 2;
            cnt++;
            if(n == 1) break;
        }
        System.out.println(cnt);
    }
}