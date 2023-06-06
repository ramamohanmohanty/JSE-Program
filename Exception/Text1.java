public class Text1 {
    public static void main(String[] args) {
        int x = 100;
        int y = args.length;
        try{
            System.out.println("Result is : "+(x+y));
            System.out.println("I am java technocrat student.");
        }catch(ArithmeticException ae){
            System.out.println("Reason of Exception is : "+ae.getMessage());
        }
    }
}
//if the exception is generated then control not move to next line it enter into block
//If i handle the ArithmeticException object

//on the otherhand

//If the Exception is not generated then control move to next line and catch block not executed.

//If Exception is generated.
//throw new ArithmeticException("/by 0")