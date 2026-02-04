import java.util.Scanner;

 class sumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the no.: ");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("sum of Digit" +sum );

    }
    public static int sumOfDigits(int num){
        int sum = 0;
        while(num>0){
            sum += num% 10;
            num /= 10;


        }
        return sum;
    }
}
