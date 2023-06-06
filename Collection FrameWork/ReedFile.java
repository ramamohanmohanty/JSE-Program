import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
	public static void main(String args[]){
	FileInputStream fis = null;
	try{
	fis = new FileInputStream("R:/CORE JAVA/io/ReadFile.java");
	int ch = 0;
	System.out.println("Read the data from the file.\n");
	while((ch = fis.read())!=-1){ 
		System.out.println((char)ch);
		}
	}catch(FileNotFoundException fe){
		System.out.println("File Not Found. ");
	}
	catch(IOException ii) {
		System.out.println("Caught");
		}
	finally{
	try{
		fis.close();
		}catch(NullPointerException ne){
			System.out.println("Check the object. ");
		}
	catch(IOException ie) {
		System.out.println("Caught Exception in finally block.");
	   }
	}
   }
}