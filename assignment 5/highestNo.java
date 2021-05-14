import java.util.Scanner;
public class highestNo {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 numbers to get 1st and 2nd highest:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int l = a[0];
        int secl = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > l) {
                secl = l;
                l = a[i];
            } else if (a[i] > secl) {
                secl = a[i];
            }
        }
        System.out.println("largest=" + l + "\nsecond largest=" + secl);
    }
}
