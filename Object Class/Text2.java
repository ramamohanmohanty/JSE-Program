public class Text2 {
    public static void main(String args[]){
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s2.hashCode()+"\t"+s2.hashCode());
        if(s1.equals(s2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        StringBuffer sb1 = new StringBuffer("'java");
        StringBuffer sb2 = new StringBuffer("java");
        System.out.println(sb1.hashCode()+"\t"+sb2.hashCode());
        if(sb1.equals(sb2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
