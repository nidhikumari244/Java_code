import java.util.Scanner;

class OccurrencesArray {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         // no. of Occurrences of an element in an array.

         int [] numArr = ArrayUtility.inputArray();
         System.out.println("enter the no. u want to find: ");
         int num = input.nextInt();
         int occurrences = noOfOccurrences(numArr, num);
         System.out.println("ur element is found " + occurrences + " times in the array ");
     }
     public static int noOfOccurrences(int[] numArr, int num){
         int occ = 0;
         int i = 0;
         while(i< numArr.length){
             if (numArr[i]==num){
                 occ++;
             }
             i++;
         }
         return occ;
     }
}
