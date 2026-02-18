import java.util.Arrays;

public class passingInFunction {
    public static void main(String[] args) {
        int [] nums ={2,32,44,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[0]= 100;
//        arr[1]=12;
//        arr[2]=24;
//        arr[3]=44;


    }
}
