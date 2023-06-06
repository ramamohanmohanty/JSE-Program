import java.io.*;
enum Chocolate {
    Dairymilk(20),Milkeybar(15);
    int price;
    Chocolate(int price){
        this.price = price;
    }
    static void getPrice(int i){
        Chocolate cc[] = Chocolate.values();
        System.out.println("Pay rs : "+cc[i].price);
    }
}
public class Demo3 {
    public static void main(String args[])throws IOException{
        for(Chocolate aa : Chocolate.values()){
            int no = aa.ordinal();
            System.out.println(no +" : "+aa);
        }
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter your Choice. ");
        int ch = Integer.parseInt(dis.readLine());
        Chocolate.getPrice(ch);
    }
}
