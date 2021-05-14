import java.util.Scanner;
public class RecArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,m,r,digits=0,sum=0;
        System.out.println("enter a number to check armstrong:");
        a = sc.nextInt();
        m=a;
        while (m != 0) {
            digits = digits + 1;
            m = m / 10;
        }
        m=a;
        r=arm(m,digits,sum);
        if (r == a) {
            System.out.println("number is armstrong");
        } else {
            System.out.println("number is not armstrong");
        }
    }
    public static int  r;
    public static int arm(int n, int a, int s) {
        if (n != 0) {
            r = n % 10;
           s = (int) (s + (Math.pow(r, a)));
           n = n / 10;
           return arm(n,a,s);
        }
    return (s);
    }

}