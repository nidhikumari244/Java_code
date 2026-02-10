public class TwoD_array {
    public static void main(String[] args) {
        int[][] myArr = new int[2][3];
        myArr[0][0]=9;

        int [][] arr = {{12,2,2,4} , {2,5} ,{5,4,14}};
        System.out.println(arr[0].length);

// TRAVERSAL-----

        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j<arr[i].length){
                System.out.print(arr[i][j]+ " ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
