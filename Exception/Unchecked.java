import javax.xml.transform.Source;

public class Unchecked {
    static void call1(){
        System.out.println("Unchecked Exception");
        try{
            throw new Error();//here i generate an unchecked exception(error)object
            //here control not move to next line
        }catch(Error ee){
            System.out.println("I caught the Error object within the method.");
        }
    }
    static void call2(){
        throw new Error();
    }
    public static void main(String[] args) {
        call1();
        try{
            call2();
        }catch(Throwable tt){
            System.out.println("I cought the Error object at the calling time.");
        }
    }
}
//try catch finally throws
