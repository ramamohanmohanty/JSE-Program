public class Text1{
    public static void main(String[] args) {
        Text1 t1 = new Text1();
        Text1 t2 = new Text1();
        System.out.println(t1.hashCode()+"\t"+t2.hashCode());
        if(t1.equals(t2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        Text1 t3=t2;
        System.out.println(t2.hashCode()+"\t"+t3.hashCode());
        if(t2.equals(t3)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}