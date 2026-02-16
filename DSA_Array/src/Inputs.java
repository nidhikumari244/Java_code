import java.util.Arrays;
import java.util.Scanner;

class Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array of primitives
       int[] arr = new int[6];
        System.out.println(arr[4]);

        // input using loop--
//       for (inti = 0;i<arr.length;i++){
//           arr[i]=in.nextInt();
//
//        }
//        System.out.println(Arrays.toString(arr));

//       for(int i = 0; i<arr.length;i++){
//           System.out.print(arr[i] +" ");
//       }

//       for(int num : arr) {
//           System.out.print(num + " ");
//       }

        // Array of Objects
       String[] str = new String[4];
       for (int i = 0; i < str.length; i++) {
           str[i]= in.next();
       }
        System.out.println(Arrays.toString(str));
    }
}
