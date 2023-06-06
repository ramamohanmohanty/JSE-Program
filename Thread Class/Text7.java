public class Text7 implements Runnable {    //Priority of the Thread
    public static void main(String[] args) {
        Text7 tt = new Text7();
        Thread t1 = new Thread(tt,"Java");
        Thread t2 = new Thread(tt,"Spring");
        Thread t3 = new Thread(tt,"Hibernate");
        t1.setPriority(10);
        t2.setPriority(1);
        System.out.println("First Thread priority is : "+t1.getPriority());
        System.out.println("Second Thread Priority is : "+t2.getPriority());
        System.out.println("Thrid Thread Priority is : "+t3.getPriority());
        t1.start();
        t2.start();
        t3.start();
    }
    @Override
    public void run(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ie){

        }
        System.out.println("Thread name is : "+Thread.currentThread().getName());
    }
}
