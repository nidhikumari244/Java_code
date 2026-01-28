import java.util.Scanner;

public class positiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("wlc to no:");
        System.out.println("enter ur no: ");

        int num = input.nextInt();

        if (num > 0){
            System.out.println("enter no. is +ve");

        }else if (num == 0){
            System.out.println(" your no. is zero");

        }else {
            System.out.println("ur no is -ve");
        }
    }
}
