import java.util.Scanner;

 class LCM {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("wlc to lcm");
        System.out.println("enetr ur no.: ");
        int first = input.nextInt();
        System.out.println("enter ur 2nd no.: ");
        int second = input.nextInt();

        int lcm = lcm(first,second);
        System.out.println("LCM of the 2 no is: "+ lcm);
    }
    public static int lcm(int first , int second){
        int i = 1;
        while (true) {
            int factor = first * i;
            if ( factor %second==0){
                return factor;
            }
                i++;
        }
         // // unreachable....
    }
}
