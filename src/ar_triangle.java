import java.util.Scanner;
public class ar_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("wlc to area calculator");
        System.out.println("pls enter your base in cms:");
        double base = input.nextDouble();
        System.out.println("now, enter your perpendicular height in cms");
        double height = input.nextDouble();

        double area =  (base * height) / 2;

        System.out.println("area of triangle is : " +area + "cm^2");
    }
}
