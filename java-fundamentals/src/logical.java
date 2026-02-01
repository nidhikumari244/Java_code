import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter ur age: ");
        int age = input.nextInt();
        System.out.println("are u female? (true/false) ");
        boolean isFemale = input.nextBoolean();

        if (age < 5){
            System.out.println("u got 75% discount");

        }else if (isFemale){
            System.out.println("u got 50% discount");
        } else if ( age > 60 && !isFemale){
            System.out.println("u got 25% discount");
        } else {
            System.out.println(" u got no discount");
        }
    }
}
