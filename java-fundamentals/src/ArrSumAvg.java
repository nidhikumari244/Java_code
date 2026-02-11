import java.util.Scanner;

public class ArrSumAvg {
    public static void main(String[] args) {

      int[] numArray = ArrayUtility.inputArray();
      long sum = sum(numArray);
      double avg = average(numArray);
        System.out.println("sum of the no. is:" +sum);
        System.out.println("avg of the no. is:" +avg);
    }
    public static long sum(int[] numArray) {
        int sum = 0;
        int i = 0;
        while ( i< numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;

    }
    public static double average(int[] numArray) {
        double sum = sum(numArray);

        return (sum / numArray.length);

    }
}
