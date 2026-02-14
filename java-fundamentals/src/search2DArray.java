import java.util.Scanner;

class search2DArray {
    public static void main(String[] args) {
        System.out.println("2D ARRAY\n");
        Scanner input = new Scanner(System.in);
        int [][] numArr = ArrayUtility.input2DArray();
        System.out.println("enter the no. u want to search: ");
        int num = input.nextInt();
        boolean isFound = search(numArr,num);
        if (isFound){
            System.out.println("The number is found.");

        }else {
            System.out.println("the number is not found.");
        }

    }
    public static boolean search (int[][] numArr, int num){
        int i = 0;
        while (i< numArr.length) {
            int j = 0;
            while (j < numArr[i].length) {
                if ( numArr[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
