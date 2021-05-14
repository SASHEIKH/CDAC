import java.util.Scanner;
public class primeno{
    public static void main(String[] args) {
    int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check prime:");
        n= sc.nextInt();
        prime(n);
    }
    public static void prime(int a) {
        int check = 0;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                check = 1;
                break;
            }
        }
        if (check == 0) {

            System.out.println("number is prime");
        } else
            System.out.println("number is not prime");
    }
}
