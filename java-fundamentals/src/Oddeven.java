import java.util.Scanner;

public class Oddeven
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("wlc to Odd even checker cal");

        System.out.println("enter ur no.: ");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("ur no. is an even no.");

        }else {
            System.out.println("ur no. is odd no.: ");
        }
    }
}
