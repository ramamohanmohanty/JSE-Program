public class Text6 {
    int roll;
    String name;
    Text6() {
        System.out.println("Object is Constructed.  ");
    }
    public void setRoll(int roll){
        this.roll = roll;
    }
    public int getRoll(){
        return roll;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "Roll : "+roll+" Name : "+name;  
    }
    public static void main(String[] args) {
        Text6 t1 = new Text6();
        Text6 t2 = new Text6();
        t1.setRoll(209);
        t1.setName("Ram.");
        t2.setRoll(308);
        t2.setName("Madhu.");
        System.out.println(t1);
        System.out.println(t2);
    }
}
