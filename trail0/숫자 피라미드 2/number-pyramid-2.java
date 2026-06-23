import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= i+1; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}