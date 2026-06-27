import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int i = start;
        while(i <= end){
            System.out.print(i + " ");
            i+=2;
        }
    }
}