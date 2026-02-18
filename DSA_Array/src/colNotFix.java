public class colNotFix {
    public static void main(String[] args) {
        int [][] arr = {
                {12,1,4,6},
                {23,5,8},
                {90,43}
        };
        for ( int row = 0; row < arr.length; row++) {
            for (int col =0; col< arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
