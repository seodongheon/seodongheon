import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int n[] = new int[count];
        for(int i = 0; i < count; i++){
            n[i] = sc.nextInt();
        }

        for(int i = count - 1; i >= 0; i--){
            if(n[i] % 2 == 0){
                System.out.print(n[i] + " ");
            }
        }

    }
}