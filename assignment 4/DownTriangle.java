import java.util.Scanner;

public class DownTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter a number of rows:");
        a= sc.nextInt();
        for (int i=1;i<=a;i++)
        {
            for (int j=a;j>=i;j--)
            {
                System.out.print("*");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

