public class parameter {
    public static void main(String[] args) {
        System.out.println(sumTwoNumbers(4,7));
        System.out.println(sumTwoNumbers(10,5));
        System.out.println(sumTwoNumbers(-68,9));

    }
    public static int sumTwoNumbers(int first, int second){
        System.out.println("First number received: " +first);
        System.out.println("second Number received: "+ second);
        int sum = first + second;
        return sum;
    }
}
