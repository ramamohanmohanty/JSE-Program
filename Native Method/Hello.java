public class Hello {
    static {
        System.loadLibrary("Ram");
    }
    public static native void Hello();
    
    public static void main(String args[]){
        Hello();
    }
}
