import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter a number of rows:");
        a= sc.nextInt();
        for (int i=1;i<=a;i++)
        {
            for (int j=a-1;j>=i;j--)
            {
                System.out.print(" ");
            }
                for (int k=1;k<=2*i-1;k++)
                {
                    System.out.print("*");
                }
            System.out.println();
            }
        }
    }


