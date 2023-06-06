class Stud{
    String name;
    int roll;
    public Stud() {
        System.out.println("Object is Constructed. ");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setRoll(int roll){                  //Syntax error
        this.roll = roll;
    }
    public int getRoll(){
        return roll;
    }
}
public class Demo{
    public static void main(String args[]){
        try{
            //i want to load Stud class
            Class cc = Class.forName("stud");
            //Through the object of class i want construct stud class object
            Stud ss = (Stud)cc.newInstance();
            ss.setName("Ram kumar");
            ss.setRoll(195);
        }
    }
}