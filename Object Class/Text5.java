public class Text5 {
    int roll;
    String name;
    Text5(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Roll : "+roll+" Name : "+name;
    }
    public static void main(String args[]){
        Text5 tt = new Text5(106, "JT");
        Text5 aa = new Text5(102, "RAM");
        System.out.println(tt);
        System.out.println(aa);
    }
}