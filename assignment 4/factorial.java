import java.util.Scanner;

public class factorial {
        public static void main(String[] args) {
            int a;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number for factorial:");
            a= sc.nextInt();
            factorial(a);
    }
    public static void factorial(int n){
        long f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("factorial of "+n+" = "+f);
    }
    }

