public class SearchInString {
    public static void main(String[] args) {
        int [] arr = {1,12,24,54,65,76,87,3,100};

        // have to put value on it to check
        int target = 12;
        System.out.println(linearSearch(arr, target,1,4));

    }

    static int linearSearch(int[] arr, int target, int start , int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            // check for the element at every index if it is = target
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
