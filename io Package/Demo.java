import java.io.*;
public class Demo{
	public static void main(String args[]){
		File f1 = new File("R:/CORE JAVA/io Package/Demo.java");
		System.out.println("name is : "+f1.getName());
		System.out.println("Path of the File : "+f1.getPath());
		System.out.println("Parent working directory : "+f1.getParent());
		System.out.println("Read Permission : "+f1.canRead());
		System.out.println("Is hidden file : "+f1.isHidden());
		System.out.println("Is file object points to file : "+f1.isFile());
		System.out.println("Is file object points to a directory : "+f1.isDirectory());
		System.out.println("Is file exists : "+f1.exists());
		f1.setReadOnly();
		System.out.println("Hi");
		}
	}