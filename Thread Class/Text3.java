public class Text3 {                                //Question no - 1
    public static void main(String args[]){
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run(){
                System.out.println("Thread name is : "+ Thread.currentThread().getName());
                System.out.println("Thread Priority is : "+ Thread.currentThread().getName());
                System.out.println("Thread ID is : "+ Thread.currentThread().getName());
            }
        });
        t1.setName("First");
        t1.setPriority(10);
        t1.start();
            
    }
}
