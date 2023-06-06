public class Checked {
    static void call1(){
        System.out.println("Checked Exception");
        try{
            throw new  Exception();
            //I generate Checked Exception
            //control not move to next line.Search the catch block to handle Exception object.
        }catch(Exception ee){
            System.out.println("I caught the Exception object within the method");
        }
    }
//by using thows keyword in method prototype programmer instruct the java compiler that
//the caller of the method is responsibble to handle the exception object
    static void call2()throws Exception {
        throw new Exception(); // i generate checked Exception
    } 
    public static void main(String[] args) {
        call1();
        try{
            call2();
        }catch(Throwable tt){
            System.out.println("handle  the exception object at calling time.");
        }
    }
}