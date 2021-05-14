import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter a number to check armstrong:");
        a= sc.nextInt();
        arm(a);
    }
    public static void arm(int n){
        int m= n, digits=0, r,s=0;
        while(m!=0)
        {
            digits=digits+1;
            m=m/10;
        }
        m=n;
        while(m!=0) {
            r = m % 10;
            s= (int) (s+ (Math.pow(r,digits)));
            m = m / 10;
        }
        if(s==n)
        {
            System.out.println("number is armstrong");
        }
        else {
            System.out.println("number is not armstrong");
        }
    }
}