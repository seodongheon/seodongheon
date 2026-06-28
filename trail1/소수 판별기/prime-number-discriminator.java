import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean satisfic = true;

        for(int i = 2; i < n; i++){
            if(n % i == 0){ // 소수가 아닌 경우
                satisfic = false;
            }
        }
        if(satisfic == true){
            System.out.println('P');
        }else{
            System.out.println('C');
        }
    }
}