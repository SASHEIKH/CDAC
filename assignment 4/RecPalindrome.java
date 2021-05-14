import java.util.Scanner;

public class RecPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,r,m;
        System.out.println("enter a number to check number is palindrome or not:");
        a= sc.nextInt();
        m=a;
        r=palindrome(a);

        if(m==r)
        {
            System.out.println("number is palindrome");
        }
        else {
            System.out.println("number is not palindrome");
        }
    }
    public static int r,sum=0;
    public static int palindrome(int n){

        if (n!=0) {
            r=n%10;
            sum=(sum*10)+r;
            n = n / 10;
            palindrome(n);
        }

        return sum;

    }
}
