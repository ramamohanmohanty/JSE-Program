
//step1
public class Text2 extends Thread {
    
        //step2
        @Override
        public void run() {
            for (int i=1; i<=3; i++){
                Thread xx = Thread.currentThread();
                String naame = xx.getName();
                System.out.println("Running Thread Name is : "+naame+" : "+i);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException ie){

                }
            }
            System.out.println("Dead Thread name is : "+Thread.currentThread().getName());
        }
    public static void main(String args[]){
        //Step3
        Text2 t1 = new Text2("First");//I create user defined Thread
        Text2 t2 = new Text2("Second");//I create user defined Thread
        Text2 t3 = new Text2("Third");//I create user defined Thread
    }
    Text2(String name) {
        super(name);
        //step4
        start();

    }
    
}
