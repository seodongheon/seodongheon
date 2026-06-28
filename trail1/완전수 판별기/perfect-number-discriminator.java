import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();



        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum += i; // n의 약수 개수 count;
            }
        }

        if(sum == n){
            System.out.println('P');
        }else{
            System.out.println('N');
        }
    }
}