import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" wlc to tem cal");
        System.out.println("enter ur tem in F: ");
        float fah = input.nextFloat();
        float cel = (fah -32)* 5.0f / 9.0f;
        System.out.println("your temp is :" + cel + "C");
    }
}
