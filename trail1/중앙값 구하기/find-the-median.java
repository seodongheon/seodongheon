import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int median;
        
        // A가 중앙값인 경우: (B <= A <= C) 또는 (C <= A <= B)
        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            median = a;
        } 
        // B가 중앙값인 경우: (A <= B <= C) 또는 (C <= B <= A)
        else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            median = b;
        } 
        // A와 B 둘 다 아니라면 중앙값은 C
        else {
            median = c;
        }
        
        System.out.println(median);
        
        sc.close();
    }
}