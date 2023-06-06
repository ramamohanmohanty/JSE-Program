interface A { //Abstract
    int data = 1007; //public static final
    void show (); //public abstract
    void call (); //public abstract
    }
interface B {
    void fun();
    void display();
}
public class Demo implements A,B {
        @Override
        public void call() {
            System.out.println("Hello");
        }
        @Override
        public void show() {
            System.out.println("My");
        }
        @Override
        public void fun() {
            System.out.println("is");
        }
        @Override
        public void display() {
            System.out.println("Shyam");
        }
        public static void main(String args[]){
            Demo dd = new Demo ();
            dd.call();
            dd.show();
            dd.fun();
            dd.display();
            System.out.println("Data value is :"+A.data);
        }
}