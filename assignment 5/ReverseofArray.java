import java.util.Scanner;
public class ReverseofArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        int n = b.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 numbers to reverse:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("original array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("\nreversed array");
        for (int i = 0; i < n; i++) {
            b[i] = a[n-i-1];
            System.out.print(b[i]);
        }
    }
}