import java.io.*;
public class Text10 {
    public static void main(String[] args) {
        try{
            DataInputStream dis = new DataInputStream(System.in);
            System.out.println("Enter first number.");
            int num = Integer.parseInt(dis.readLine());
            System.out.println("Enter the Second Number.");
            int num1 = Integer.parseInt(dis.readLine());
            System.out.println("Result is : "+(num*num1));
        }catch(IOException ie){
            System.out.println("Hello");
        }
    }
}
