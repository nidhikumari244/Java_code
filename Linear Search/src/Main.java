
public class Main {
    public static void main(String[] args) {
       int [] nums = {12,2,4,45,65,-2,14,-10};
       int target = 12;
       int ans = linearSearch(nums,target);
        System.out.println(ans);

    }

    static boolean linearSearch3(int[] arr, int target ){
        if (arr.length == 0) {
            return false;
        }
        // run a loop
        for (int element : arr){
            if (element == target){
                return true;
            }
        }
        return false;
    }

    static int linearSearch2(int[] arr, int target ) {
        if (arr.length == 0) {
            return -1;
        }
        // run a loop---
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        //target not found
        return Integer.MAX_VALUE;
    }
    // search and return
    static int linearSearch(int[] arr, int target ) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
        // this line will execute if none of the return statements above have executed
        // so the target not found
        return -1;
    }
}