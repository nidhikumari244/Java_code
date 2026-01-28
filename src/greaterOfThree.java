import java.util.Scanner;

public class greaterOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("wlc to greater finder cal");
        System.out.println("enter ur 1st no.: ");

        int first = input.nextInt();
        System.out.println("now, enter ur 2nd no.: ");
        int second = input.nextInt();
        System.out.println("enter ur 3rd no.: ");
        int third = input.nextInt();

        if (first>=second && first >= third) {
            System.out.println(first + "is the greater num er");

        }else if (second >= first && second >= third){
            System.out.println(second + " is the greatest number");
        } else {
            System.out.println(third + "is the greatest number");
        }
    }
}
