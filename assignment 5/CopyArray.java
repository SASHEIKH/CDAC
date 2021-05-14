import java.util.Scanner;
public class CopyArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 numbers to copy:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("original array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("\ncopied array");
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
            System.out.print(b[i]);
        }
    }
}
