public class Text5 extends Thread {
    @Override
    public void start(){
        System.out.println("I give the life to the Thread.");
        super.start();//then i call start() method of Thread Class.This method give the life to the Thread
    }
    @Override
    public void run(){
        System.out.println("Thread is running");    //Question no - 3
    }
    Text5(String name){
        super(name);;
        start();//it call override start method
    }
    public static void main(String[] args) {
        Text5 t1 = new Text5("Java");
    }
}
