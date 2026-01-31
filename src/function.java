public class function {
    public static void main(String[] args) {
//        System.out.println("in main method");
//        greetUser();
//        System.out.println("method calling complete");
//        greetUser();

        //printFirstPattern();
        printSecondPattern();
        //printThirdPattern();
    }


    public static void printFirstPattern(){
        System.out.println(" *");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
    }

        //right half method
        public static void printSecondPattern() {
            int rows = 0;
            while (rows < 6) {
                System.out.print("*");

                int i = 0;
                while (i < rows) {
                    System.out.print(" *");
                    i++;
                }
                System.out.println();
                rows++;
            }
        }

    public static void greetUser(){
        System.out.println("ga");
    }
}
