import java.util.Scanner;
public class squareroot {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a numbers to get square root:");
        a = sc.nextInt();
        root(a);
    }

    public static void root(int n) {
        double a;
        double sr = n / 2;
        do {
            a = sr;
            sr = (a + (n / a)) / 2;
        }while ((a-sr)!=0);
        System.out.println(sr);
    }
}
