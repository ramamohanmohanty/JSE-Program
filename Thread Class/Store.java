import java.io.*;
public class Store {
    public static void main(String[] args) {
        FileWriter fw = null;
        try{
            fw = new FileWriter("rr.txt");              //error
            String data = "I Love Java Tehnocrat.";
            fw.write(data);//I write the data on the file rr.txt
        }catch(Exception ee){
            System.out.println("Caught");
        }finally{
            try{
                fw.close();
            }catch(IOException ie){               
            }
        }
    }
}
