import java.util.Scanner;
public class fib {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers you want:");
        a= sc.nextInt();
        fib(a);
    }
    public static void fib(int n){
        int a = 0, b = 0, c = 1;
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }
}