import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your no: ");
        int num = input.nextInt();
       boolean isPalindrome  = isPalindrome(num);
       if ( isPalindrome) {
           System.out.println("ur no is palindrome no.");
       }else {
           System.out.println("ur no. is not a palindrome no.");
       }

    }
    public static boolean isPalindrome( int num){
        return num == reverse(num);

    }
    public static int reverse (int num) {
        int newNum = 0;
        while(num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
