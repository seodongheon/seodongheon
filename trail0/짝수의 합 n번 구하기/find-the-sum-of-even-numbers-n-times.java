import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i = 0; i < count; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int sum = 0;
            for(int j = start; j <= end; j++){
                
                if(j % 2 == 0){
                    sum += j;
                }
            }
            System.out.println(sum);

        }
    }
}