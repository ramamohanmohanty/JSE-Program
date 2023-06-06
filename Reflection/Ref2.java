import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

import java.lang.reflect.*;
class X {
    private void cube(int num){
        System.out.println("cube of : "+num+" is : "+(num*num*num));
    }
}
public class Ref2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number. ");
        int num = sc.nextInt();
        try{
            Class cc = Class.forName("X");
            X ab = (X)cc.newInstance();
            Method mm  = cc.getDeclaredMethod("cube", new Class[]{int.class});
            mm.setAccessible(true);
            mm.invoke(ab,num);
        }catch(Exception ee) {
            System.out.println("Cought");
        }
    }
}