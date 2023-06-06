public class Demo implements Cloneable {
    int data;
    Demo(int data) {
        this.data = data;
    }
    public static void main(String args[]) {
        Demo d1 = null, d2 = null;
        try{
            d1  = new Demo(145);// Original Object
            System.out.println("Data for original Object is : "+ d1.data);  //145
            d2 = (Demo) d1.clone();// I Create a duplicate object
            System.out.println("Data for duplicate object is : "+ d2.data); //145
            if(d1.equals(d2)){
                System.out.println("Same Object. ");
            }else{
                System.out.println("Different Object. ");
            }
        }catch(CloneNotSupportedException ce){
            System.out.println("Object is not cloned. ");
        }catch(NullPointerException ne) {
            System.out.println("Initialize the object. ");
        }
    }
}