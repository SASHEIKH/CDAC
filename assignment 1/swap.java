public class swap {
    public static void main(String args[]){
        int a=10, b=20;
        int swap;
        System.out.println("value before swap");
        System.out.println("a="+a+ " b="+b);
        swap=a;
        a=b;
        b=swap;
        System.out.println("\nvalue after swap ");
        System.out.println("a="+a+ " b="+b);
    }
}
