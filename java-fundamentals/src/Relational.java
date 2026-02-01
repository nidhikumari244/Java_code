import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("wlc to Driving License portal");
        System.out.print("pls enter ur age: ");
         int age = input.nextInt();

         if(age>=18){
             System.out.println("u r eligible to drive");

         }else {
             System.out.println("keep ur cycle moving");
         }
    }
}
