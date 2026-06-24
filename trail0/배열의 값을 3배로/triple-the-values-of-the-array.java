import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n[][] = new int[100][100];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                n[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print( (n[i][j]*3) + " ");
            }
            System.out.println();
        }


    }
}