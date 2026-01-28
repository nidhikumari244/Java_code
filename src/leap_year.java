import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("wlc to new year that u want to calculate");
        System.out.println("enter the year that u want to check: ");

        int year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println("your is leap year");
        } else if (year % 100 == 0) {
            System.out.println("your year is not a leap year");

        }else if (year % 4 == 0){
            System.out.println("your year is a leap year");

        }else {
            System.out.println("your year is not a leap year");
        }
    }
}
