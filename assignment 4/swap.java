import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number to swap:");
        a= sc.nextInt();
        b= sc.nextInt();
        System.out.println("a= "+a+" , b= "+b);
        swap(a,b);
    }
    public static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a= "+a+" , b= "+b);
    }
}

