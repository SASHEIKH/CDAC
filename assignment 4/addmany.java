import java.util.Scanner;
public class addmany{
    public static void main(String[] args) {
        int n,m,result;
        add1();
        result = add2();
        System.out.println("result from 2nd ="+result);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        n= sc.nextInt();
        System.out.println("enter second number:");
        m= sc.nextInt();
        add3(n,m);
        System.out.println("enter first number:");
        n= sc.nextInt();
        System.out.println("enter second number:");
        m= sc.nextInt();
        result = add4(n,m);
        System.out.println("result from 4th ="+result);
        System.out.println("enter first number:");
        n= sc.nextInt();
        System.out.println("enter second number:");
        m= sc.nextInt();
        if(n != 0 && m != 0)
        {
            result = n+m;
            System.out.println("result from 5th ="+result);

        }
    }
    public static void add1() {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        a= sc.nextInt();
        System.out.println("enter second number:");
        b= sc.nextInt();
        c=a+b;
        System.out.println("result from 1st ="+c);
    }
    public static int add2() {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        a= sc.nextInt();
        System.out.println("enter second number:");
        b= sc.nextInt();
        c=a+b;
        return c;
    }
    public static void add3(int a, int b) {
        int c;
        c=a+b;
        System.out.println("result from 3rd ="+c);
    }
    public static int add4(int a, int b) {
        int c;
        c=a+b;
        return c;

    }
}