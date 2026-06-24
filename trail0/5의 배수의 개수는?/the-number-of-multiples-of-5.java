import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n[][] = new int[4][4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                n[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(n[i][j] % 5 == 0){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);   
    }
}