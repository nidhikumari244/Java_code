import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("wlc to grade cal");
        System.out.println("enter your percentage:");
        float percentage = input.nextFloat();

        if (percentage >= 90)
        {
            System.out.println("great , you have got A+");

        }else if (percentage >=80){
            System.out.println("good, u have got b+");

        }else if(percentage >= 60){
            System.out.println("u have got C, work hard next time");

        }else if(percentage >= 33)
        {
            System.out.println("poor , need to work hard");

        }else{
            System.out.println("failed,F");

        }
    }
}
