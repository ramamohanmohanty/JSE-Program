public class Text8 implements Runnable {
    public static void main(String args[]){
         System.out.println("I");
         System.out.println("Like");
         Text7 tt = new Text7();
         Thread t1 = new Thread("tt");
         t1.start();
         try{
            t1.join();
         }catch(InterruptedException ie){

         }
         Thread t2 = new Thread(tt);
         t2.start();
         try{
            t2.join();
         }catch(InterruptedException ie){
            }
        System.out.println("Java");
        System.out.println("Technocrat");
    }
    @Override
    public void run() {
        for(int i=1; i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){               
                }
        }
    }
}
