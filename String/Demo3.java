public class Demo3 {
    public static void main(String[] args) { 
        String s1 = new String("java");//String Object
        String s2 = "java";// String literel
        String s3 = "JAVA";//String literel
        String s4 = "java";//String literal
        String s5 = "JAVA";//String literal
        String s6 = new String("java");//String Object 
        //here s1,s22,s3,s4,s5,s6 are treated as String reference
        if (s1 == s2) {
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        if(s1 == s3 ){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        if(s2 == s3){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        if(s1 == s6){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        if(s2 == s4){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        if(s3 == s5){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
    }
}
