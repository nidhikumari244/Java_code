import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("wlc to our calculator");
        System.out.println("pls enter 1st number:");
        int firstNum = input.nextInt();
        System.out.print("now, pls enter the 2nd no: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("sum of two nos is:");


    }
}
