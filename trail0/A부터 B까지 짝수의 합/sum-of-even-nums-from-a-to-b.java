import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int last = sc.nextInt();
        int total = 0;
        for(int i = first; i <= last; i++){
            if(i % 2 == 0) total += i;
            continue;
        }
        System.out.println(total);
    }
}