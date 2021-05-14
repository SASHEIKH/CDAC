import java.util.Scanner;
public class RecFact {
    public static void main(String[] args) {
        int a,fact;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for factorial:");
        a= sc.nextInt();
        fact=factorial(a);
        System.out.println("factorial of "+a+" = "+fact);
    }
    public static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

}
