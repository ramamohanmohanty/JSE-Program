public class Text7 {
    public void call(){
        System.out.println("I Love Java Technocrat. ");
    }
    Text7(){
        System.out.println("Object is Constructed. ");
    }
    @Override
    public void finalize() {
        System.out.println("I will kill you. ");
    }
    static void display() {
        Text7 t1 = new Text7();
        t1.call();
        t1 = null;//How the object is orphan object
        Text7 t2 = new Text7();
        t2.call();
        t2.call();
        t2.call();
        t2.call();
        t2.call();
        t2.call();//How this object  also an orphan object
    }
    public static void main(String args[]){
        display();
        System.gc();//I explicitly call Garbage Collector
        try{
            Thread.sleep(30000);
        }catch(Exception ee){          
        }
        System.out.println("I Quit Main Method. ");
    }
}
