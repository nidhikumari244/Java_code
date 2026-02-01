import java.util.Scanner;

public class AgeCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter ur age");
        int age = input.nextInt();
        if (age >= 65)
        {
            System.out.println("u r a senior citizen");

        }else if (age >= 20){
            System.out.println("u r an adult");

        }else if (age >= 13){
            System.out.println("u r a teenager");

        }else {
            System.out.println("u r a child ");
        }
    }
}
