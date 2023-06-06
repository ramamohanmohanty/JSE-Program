class Address implements Cloneable {
    String flatno = "A/54";
    String area = "Saheed Nagar ";
    String State = "Odisha";
    @Override
    public String toString() {
        return "Flat No : "+flatno + "Area : "+area +" State : "+ State;
    }
    @Override
    public Address clone() throws CloneNotSupportedException {
        return(Address)super.clone();
    }
}
public class Demo1 implements Cloneable {
    String name = "Ram";
        int roll = 156;
        double fee = 7000.0;
        String course = "Java";
        Address aa = new Address();

        @Override

        public Demo1 clone()throws CloneNotSupportedException {
            Demo1 jj = (Demo1) super.clone();
            jj.aa = this.aa.clone();
            return jj ;
        }
    public static void  main(String args[]) {
        Demo1 dd = new Demo1(); // Original Object

        try {
            Demo1 kk = dd.clone(); //duplicate Object
            System.out.println("original Object contents are : "+"Name : "+dd.name+" Roll : "+dd.roll+" Fee : "+dd.fee+" Course : "+dd.course+" Address : "+dd.aa);
            System.out.println("Duplicate object contents are : "+"Name : "+kk.name+" Roll : "+kk.roll+" Fee : "+kk.fee+"Course : "+kk.course+" Address "+kk.aa);
            System.out.println("Check about internal object. ");
            if(dd.aa.equals(kk)){
                System.out.println("Shallow Cloning.");
            }else {
                System.out.println("Deep Cloning.");
            }
            System.out.println("What about the top level object.");
            if(dd.equals(kk)){
                System.out.println("Same object.");
            }else {
                System.out.println("Different object.");
            }
        }catch(CloneNotSupportedException ce){
            System.out.println("Object is not Cloned.");
        }
    }
}
