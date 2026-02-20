import java.util.Arrays;

//import static java.util.Collections.swap;

public class Swap {
    public static void main(String[] args) {
        int [] arr ={1,2,4,5,6,7,83};
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap (int[]arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]= temp;
    }
}
