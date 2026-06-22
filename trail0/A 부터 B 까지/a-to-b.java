import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        while(start <= end){
            System.out.print(start + " ");
            if(start % 2 == 1){
                start *= 2;
            }
            else if(start % 2 == 0){
                start += 3;
            }
        }
    }
}