import java.util.Scanner;

public class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter ur no: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("print reverse of ur no. is :" + reverse);
    }
    public static int reverse(int num){

        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
