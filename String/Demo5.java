public class Demo5 {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = "java";
        String s3 = "Java";
        System.out.println(s1.hashCode() + "\t" + s2.hashCode() + "\t" +s3.hashCode());

        String x = String.valueOf(198);
        System.out.println(x);

        String ss = "this is a demo of java program";
        int index1 = ss.indexOf('a'); // it search first a available in which index
        System.out.println("First a is availble in :"+ index1);
        int  index2 = ss.indexOf('a', (index1+1));// 2nd a is available in 19th index
        System.out.println("2nd a is available in : "+ index2);
        int index3 = ss.indexOf('A');//-1
        System.out.println("If A is  not available : "+ index3);//-1
        int index4 = ss.lastIndexOf('a');//28th index
        System.out.println("last a is available in : "+index4);
        String sub = ss.substring(ss.indexOf('j'),ss.length());
        System.out.println("substring of string is : "+sub);

        String ss1 = "Hi";
        String ss2 = "Hello";
        System.out.println(ss1.compareTo(ss2));//4
        System.out.println(ss2.compareTo(ss1));//-4

        String ss3 = "Hello";
        System.out.println(ss2.compareTo(ss3));//0

        String ss4 = "Ram";
        System.out.println(ss4.compareTo(ss3));//-1 
    }
}
