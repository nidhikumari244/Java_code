import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("wlc to S.I cal");
        System.out.println("pls enter ur principle amount Rs");
        int principle = input.nextInt();
        System.out.println("now,tell me ur rate of interest: ");
        float rate = input.nextFloat();
        System.out.println("now, tell me for how many years are u borrowing in this:");
        float years = input.nextFloat();

        float interest = (principle * rate * years) / 100;
        System.out.println("\n uy Simple interest is Rs: " +interest);

    }
}
