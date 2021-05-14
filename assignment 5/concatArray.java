import java.util.Scanner;
public class concatArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element of 1st array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter element of 2nd array");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        int result[]= new int[10];
        System.out.println("concatnated array using arraycopy");
        System.arraycopy(a, 0, result, 0, 5);
        System.arraycopy(b, 0, result, 5, 5);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println("\nconcatnated array using foreachloop");
        int p = 0;
        for (int element : a) {
            result[p] = element;
            p++;
        }
        for (int element : b) {
            result[p] = element;
            p++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
