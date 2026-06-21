import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String fruit[] = {"apple", "banana", "grape", "blueberry", "orange"};
        char ch = sc.next().charAt(0);
        int cnt = 0;

        for(int i = 0; i < 5; i++){
            if(fruit[i].charAt(2) == ch || fruit[i].charAt(3) == ch){
                System.out.println(fruit[i]);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}