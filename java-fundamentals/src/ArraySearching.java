import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int[] arr = {2,45,6,7,8,21,45,67,98,99,100};

        System.out.println("wlc to array searching\n");

        System.out.println("enter the no. u want to search: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr,num);
        if ( isFound){
            System.out.println("ur no. was found in the array");
        } else {
            System.out.println("ur no. is not found in the array");
        }


    }
    public static boolean isFound(int[] arr,int num){
        int index = 0;
        while (index < arr.length){
            if (arr[index]==num){
                return true;
            }
            index++;
        }
        return false;
    }
}
