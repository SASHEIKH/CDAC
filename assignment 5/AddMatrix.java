import java.util.Scanner;
public class AddMatrix {
    public static void main(String[] args) {
        int r = 2, c = 3;
        int a[][] = new int[2][3];
        int b[][] = new int[2][3];
        int result[][] = new int[r][c];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element of 1st matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter element of 2nd matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
