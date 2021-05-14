import java.util.Scanner;
public class ladder {
    public static void main(String[] args) {
        int arr[][]=new int[4][];
        for (int a=0;a< arr.length;a++)
        {
            arr[a]=new int[a+1];
        }
        Scanner sc=new Scanner(System.in);
        for(int i =0;i< arr.length;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                System.out.println("enter element");
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i =0;i<arr.length;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
