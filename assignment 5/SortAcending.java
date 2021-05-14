import java.util.Scanner;
public class SortAcending {
    public static void main(String[] args) {
        int a[] = new int[5];
        int n = a.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 numbers to sort in ascending:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("original array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\nsorted array in ascending:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
