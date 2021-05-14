import java.util.Scanner;

public class RecFibo {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers you want:");
        a = sc.nextInt();
        if (a == 0)
            System.out.println(a);
        if (a == 1)
            System.out.println(a + " " + b);
        fib(a);
    }
    public static int a = 0, b = 0, c = 1;
    public static void fib(int n) {
        if (n >= 1) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");
            fib(n - 1);
        }
    }
}

