import java.io.*;
public class  Demo{
    public static void main(String args[]){
        try{
            DataInputStream dis = new DataInputStream(System.in);
            System.out.println("Enter the Size of the Array. ");
            int size = Integer.parseInt(dis.readLine());
            String str[] = new String [size];
            System.out.println("Initialize the Array. ");

            for(int i=0; i<size; i++){
                str[i] = dis.readLine();
            }
            Runtime rr = Runtime.getRuntime();
            Process pp = rr.exec(str);
            System.out.println("Process is "+pp.pid());
            System.out.println("Is Process alive "+pp.isAlive());
            System.out.println(pp);
        }catch(Exception ee){

        }

    }
}