public class Text1 implements Runnable {  //step1
    public static void main(String[] args) {
        //step2
        Text1 tt = new Text1();// Runnable object
        //step3
        Thread t1 = new Thread(tt,"First");                                //error
        Thread t2 = new Thread(tt,"Second");
        Thread t3 = new Thread(tt,"Third");
        //Step4
        t1.start();
        t2.start();
        t3.start();
    }
    //Step5
    @Override
    public void run(){
        for(int i=1; i<=3; i++) {
            Thread xx = Thread.currentThread();
            String name = xx.getName();
            System.out.println("Running Thread Name is : "+name+" : "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){               
            }
        }
        System.out.println("Dead Thread Name is  : "+Thread.currentThread().getName());
    }
} 