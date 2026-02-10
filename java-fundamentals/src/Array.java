public class Array {
    public static void main(String[] args) {
  //      int [] myArr = new int [6];
//        myArr[0]=34;
//        myArr[1]=90;
//        myArr[2]=3;
//        myArr[3]=56;
//        myArr[4]=98;
//        myArr[5]=35;

        int[] myArr = {34,90,3,56,98,35};
 //       int index = 4;

//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[5]);


        // ARRAY TRAVERSAL------
        int index = 0;
        while (index < myArr.length){
            System.out.println(myArr [index]);
            index++;
        }

       String[] strArr = new String[5];
        strArr[0]="my string";
        String[] newStrArr ={"1st","2nd","3rd"};
        System.out.println(newStrArr.length);

    }
}
