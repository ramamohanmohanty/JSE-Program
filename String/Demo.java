public class Demo{
    public static void main(String[] args) {
        byte b[] = {65,66,67,68,69,70};
        String ss1 = new String (b); //ABCDEF
        System.out.println(ss1); //ABCDEF
        String s = ss1.concat("Java");
        System.out.println(s); //ABCDEF JAVA
        String ss2 = new String(b,2,3); //CDE
        System.out.println(ss2);
        char ch[] = {'A','B','C','D'};
        String ss3 = new String (ch);//ABCD
        System.out.println(ss3);
        String ss4 = new String(ch,2,3);//StringIndexOutOfBoundException
        System.out.println(ss4);
        
    }
}