import java.util.Scanner;

class diff_Pattern {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("enter the no. of rows: ");
         int rows = input.nextInt();
         printRightHalfPyramid(rows);
         printReverseRightHalfPyramid(rows);
         printLeftHalfPyramid(rows);

     }


//     public static void printFirstPattern(int maxRows) {
//         int rows = 0;
//         while (rows < maxRows)
//         {
//             System.out.print("$");
//             int i = 0;
//             while (i < rows) {
//                 System.out.print(" $");
//                 i++;
//             }
//             System.out.println();
//             rows++;
//         }
         public static void printReverseRightHalfPyramid(int maxRows) {
             System.out.println("\n here's reverse right half pyramid");
         int rows = maxRows;
         while (rows > 0 ) {
            int i = 0;
            while (i < rows){
                System.out.print("$ ");
                i++;
            }

             System.out.println();
             rows--;
         }
     }



         public static void printRightHalfPyramid(int maxRows) {
             System.out.println("\n \nhere's right half pyramid");
             int rows = 0;
             while (rows < maxRows) {
                 System.out.print("$");
                 int i = 0;
                 while (i < rows) {
                     System.out.print(" $");
                     i++;
                 }
                 System.out.println();
                 rows++;
             }


     }

    public static void printLeftHalfPyramid(int maxRows) {
        System.out.println("\n here's Left half pyramid");
        int rows = maxRows;
        while (rows > 0 ) {
           // this prints spaces
           int j = 0;
           while(j < rows - 1){
               System.out.print("  ");
               j++;
           }

            // this prints stars
            int i = 0;
            while (i <= ( maxRows-rows)){
                System.out.print("$ ");
                i++;
            }

            System.out.println();
            rows--;
        }
    }
}
