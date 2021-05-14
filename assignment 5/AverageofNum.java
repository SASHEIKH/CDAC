import java.util.Scanner;
public class AverageofNum {
    public static void main(String[] args) {
        int arr[]=new int[5];
        double total =0;
        double avg;
        Scanner sc=new Scanner(System.in);
            for(int i= 0;i<arr.length;i++)
            {
                System.out.println("enter marks of student:");
                arr[i]= sc.nextInt();
                total=total+arr[i];
            }
            avg=total/ arr.length;
            System.out.println(avg+"%");

    }
}
