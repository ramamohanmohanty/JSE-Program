public class Text4 {
    public static void main(String[] args) {
        double x = 0;
        int y = args.length;
        try{
            System.out.println("Result is : "+(x/y));//NaN
            System.out.println("Hi Jtan's");
        }catch(ArithmeticException ae){
            System.out.println("Caugth the ArithmeticException object ");
        }
    }
}
