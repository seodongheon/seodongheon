import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[10][10];
        int arr2[][] = new int[10][10];

        int nSize = sc.nextInt();
        int mSize = sc.nextInt();

        for(int i = 0; i < nSize; i++){
            for(int j = 0; j < mSize; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < nSize; i++){
            for(int j = 0; j < mSize; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < nSize; i++){
            for(int j = 0; j < mSize; j++){
                if(arr1[i][j] == arr2[i][j]){
                    System.out.print("0 ");
                }else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}