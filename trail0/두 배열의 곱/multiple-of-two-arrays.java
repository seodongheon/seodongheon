import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int arr1[][] = new int[100][100];
        int arr2[][] = new int[100][100];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr1[i][j] * arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}