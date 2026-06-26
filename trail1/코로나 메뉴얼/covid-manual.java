import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        int t1 = sc.nextInt();

        char c2 = sc.next().charAt(0);
        int t2 = sc.nextInt();

        char c3 = sc.next().charAt(0);
        int t3 = sc.nextInt();

        if(c1 == 'Y' && t1 >= 37){ // 첫 번째 사람이 코로나라면 남은 둘 중 한명 
            if(c2 == 'Y' && t2 >= 37 || c3 == 'Y' && t3 >= 37){
                System.out.println('E');
            }else{
                System.out.println('N');
            }
        }else{
            if(c2 == 'Y' && t2 >= 37 && c3 == 'Y' && t3 >= 37){
                System.out.println('E');
            }else{
                System.out.println('N');
            }
        }

    }
}