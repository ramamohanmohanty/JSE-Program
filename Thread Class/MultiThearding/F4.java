public class F4{
    public static int get() {
        try{
            System.out.println("I am in try block.");
            return 20;
        }catch(Error ae){
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