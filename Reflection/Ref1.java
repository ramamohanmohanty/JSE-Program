import java.lang.reflect.*;
import java.lang.reflect.Method;
class A {
    private void getMassage(){
        System.out.println("I like java Technocrat");
    }
}
public class Ref1 {
    public static void main(String[] args) {
        try{
            Class cc = Class.forName("A");
            A aa = (A)cc.newInstance();
            Method mm  = cc.getDeclaredMethod("getMassage",null);
            mm.setAccessible(true);
            mm.invoke(aa,null);
        }catch(Exception ee) {
            System.out.println("Cought");
        }
    }
}