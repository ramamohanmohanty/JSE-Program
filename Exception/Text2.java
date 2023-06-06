public class Text2 {
    public static void main(String[] args) {
        double x = 100;
        int y = args.length;
        try{
            System.out.println("Result is : "+(x/y));//Infinity
            System.out.println("Hi Jtan's");
        }catch(ArithmeticException ae){
            System.out.println("Caugth the ArithmeticException object ");
        }
    }
}
