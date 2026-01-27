import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("wlc to swapping station\n\n");
        System.out.println("enter value of A: ");

        int a = input.nextInt();

        System.out.println("enter the of B:  ");
        int b = input.nextInt();

        int c = a;
        a= b;
        b=c;
        System.out.println("swapping done...");
        System.out.println("Value of A is:" + a);
        System.out.println("value of B is:" + b);

    }
}
