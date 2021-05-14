import java.util.Scanner;
public class RecPrime {
    public static void main(String[] args) {
        int n,r, i=2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check prime:");
        n= sc.nextInt();
        r=prime(n,i);
        if (r==1)
        System.out.println("number is prime");
        else
            System.out.println("number is not prime");
    }
    public static int prime(int a, int i) {

        if (a>i) {
            if (a % i != 0) {
                return (prime(a, ++i));
            } else
                return 0;
        }
        return 1;
        }
    }
