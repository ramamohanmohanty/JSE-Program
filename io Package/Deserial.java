import java.io.*;											//serialization class
public class Deserial {
	public static void main(String args[]){
		try{
			FileInputStream fis = new FileInputStream("ak.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Stud obj = (Stud) ois.readObject();
			System.out.println("Name : "+ obj.name +"\t"+" Roll Number is : "+ obj.roll +"\t"+" Fee is : "+obj.fee); 
		}catch(Exception rr){
			rr.printStackTrace();
			}
	}
}