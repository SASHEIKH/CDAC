import java.util.Scanner;

public class studgrade {
        public static void main(String[] args) {
            int a,b,c,d,e,avg;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter 5 marks of a student:");
            a= sc.nextInt();
            b= sc.nextInt();
            c= sc.nextInt();
            d= sc.nextInt();
            e= sc.nextInt();
            avg=(a+b+c+d+e)/5;
            grade(avg);

        }
        public static void grade(int avg){
            if (avg>90)
            {
                System.out.println("grade is A+");
            }
            if (avg<90 && avg>80)
            {
                System.out.println("grade is A");
            }
            if (avg<80 && avg >70)
            {
                System.out.println("grade is B");
            }
            if (avg<70 && avg >60)
            {
                System.out.println("grade is C");
            }
            if (avg<60 && avg >50)
            {
                System.out.println("grade is D");
            }
        }
    }

