import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean satisfic = false;

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                satisfic = true;
            }
        }

        if(satisfic == true){
            System.out.println('C');
        }else{
            System.out.println('N');
        }
    }
}