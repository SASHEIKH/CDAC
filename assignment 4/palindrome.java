import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter a number to check number is palindrome or not:");
        a= sc.nextInt();
        palindrome(a);
    }
    public static void palindrome(int n){
        int m= n, r=0;
        while(n>0)
        {
            r=r*10;
            r=r+(n%10);
            n=n/10;
        }
        if(m==r)
        {
            System.out.println("number is palindrome");
        }
        else {
            System.out.println("number is not palindrome");
        }
    }
}

