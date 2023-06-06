public class F1{
    public static int get() {
        try{
            System.out.println("I am in try block.");
            throw new NullPointerException();
            //return 10;
        }catch(ArithmeticException ae){
            System.out.println("I am in the catch block.");
            return 20;
        }
        finally {
            System.out.println("i am in the finally block.");
            return 30;
        }
    }
    public static void main(String[] args) {
            System.out.println("Result is : "+get());
    }
}