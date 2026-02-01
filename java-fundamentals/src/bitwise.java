import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
//        System.out.println("AND operator");
//
//        System.out.println("enter the 1st no: ");
//        int first = input.nextInt();
//        System.out.println("enter 2nd no:");
//        int second = input.nextInt();
//
//        int result = first & second;
        //System.out.println("result is: " +result);

        System.out.println("odd/even cal");
        System.out.println("enter ur no:");
        int num = input.nextInt();

        if ((num & 1)== 1){
            System.out.println("ur no. is odd");

        }else {
            System.out.println("ur number is even");
        }
    }
}
