import java.io.*;												//serialization class
public class Serial {
	public static void main(String args[]){
		try{
		Stud ss = new Stud();				//It is  a seriazable object
		ss.setData("Raj Kumar",345,7633.99);
		FileOutputStream fos = new FileOutputStream("ak.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ss);
		System.out.println("Serialized object is stored on the file.");
			oos.close();
			fos.close();
		}catch(Exception ee){
			ee.printStackTrace();
			
			}
		}
	}