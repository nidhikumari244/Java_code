import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("wlc to C.I cal");
        System.out.println("pls enter ur principle amount Rs");
        int principle = input.nextInt();
        System.out.println("now,tell me ur rate of interest: ");
        float rate = input.nextFloat();
        System.out.println("now, tell me for how many years are u borrowing in this:");
        float years = input.nextFloat();

        double compInt = principle * Math.pow( (1 + rate/100), years);
        System.out.println("ur CI is Rs: " + compInt);

    }
}
