class ColorException extends Exception {
    //checked Exception
}
class WhiteException extends Exception {
    //Checked Exception
}
public class Text9 {
    static void call1()throws ColorException{
        throw new ColorException();
    }
    static void call2()throws WhiteException {      //error
    }
    public static void main(String[] args) {
        int a,b,c,d;
        a=b=c=d=0;
        try{
            call1();
            a++;//this line is not executed // a=0
        }catch(ColorException ce){
            b++;//this line is executed . //d=1
        }
        try{
            call2();
            c++;//this line is executed. //c=1
        }catch(WhiteException we){
            d++;//this line is not executed. d=0
        }
    }
}
