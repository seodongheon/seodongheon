import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int middle = sc.nextInt();
        int last = sc.nextInt();
        if(middle >= 90){
            if(last >= 95) System.out.println(100_000);
            else if(last >= 90) System.out.println(50_000);
            else System.out.println(0);
        }else{
            System.out.println(0);
        }
    }
}
