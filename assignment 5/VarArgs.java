import java.util.Scanner;
public class VarArgs {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers you want to add:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter numbers:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        sum = varargs(arr);
        System.out.println("total= "+sum);
    }
    public static int varargs(int... arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
}
