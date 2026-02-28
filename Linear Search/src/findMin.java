public class findMin {
    public static void main(String[] args) {
        int[] arr ={12, 9 , 4, 5, 7,8};
        System.out.println(min(arr));
    }
    static int min (int[] arr) {
        int ans = arr[0];
        for(int i = 1; i< arr.length; i++){
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;


    }
}
