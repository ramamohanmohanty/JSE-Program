public class Text4 implements Runnable {
    public static void main(String args[]){
        Text4 tt = new Text4();                                 //Question no - 2
        Thread t1 = new Thread(tt);
        t1.start();
        t1.start();;
    }
    @Override
    public void run(){
        System.out.println("Thread is Running.");
    }
}
