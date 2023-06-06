abstract class X {
    String name ;
    X(String name) {
        this.name = name;
    }
    public abstract String getName();
}
public class Text1 {
    public static void main(String args[]){
        X aa = new X("Ram") {
            @Override
            public String getName() {
                return name;   
            }
        };
        System.out.println("Name is : "+aa.getName());
    }
}
