import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n[] = new int[10];
        int threeCount = 0;
        int fiveCount = 0;
        for(int i = 0; i < 10; i++){
            n[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            if(n[i] % 3 == 0) threeCount++;
            if(n[i] % 5 == 0) fiveCount++;
        }

        System.out.print(threeCount + " " + fiveCount);
    }
}