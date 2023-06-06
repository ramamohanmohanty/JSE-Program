public class Text6 implements Runnable {            //Question no - 4
    public static void main(String[] args) {
        System.out.println("in main method thread name is : "+Thread.currentThread().getName());
        System.out.println("in main method thread ID id : "+Thread.currentThread().getId());
        Text6 tt = new Text6();
        Thread t1 = new Thread(tt,"Java");//user defined method         
        t1.start();//I give life to the user definrd thread
    }
    public void run(){
        System.out.println("User defined Thread name is : "+Thread.currentThread().getName());
        System.out.println("User defined Thread name is : "+Thread.currentThread().getId());
    }
    static {
        System.out.println("In class block Thread name is : "+Thread.currentThread().getName());
        System.out.println("In class block Thread name is : "+Thread.currentThread().getId());
    } 
}
